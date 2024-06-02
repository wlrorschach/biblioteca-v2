package com.estudo.spring.biblioteca.adapter.input.api.livro.dto.mapper;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.response.LivroResponseDTO;
import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    List<LivroResponseDTO> toLivrosResponse(List<LivroEntity> livro);

    @Mapping(target = "autor", source = "livro.autor.nome")
    LivroResponseDTO toLivroResponseDTO(LivroEntity livro);

    //    @Mapping(target = "livro.autor.nome", source = "autor", ignore = true)
    @Mapping(target = "autor.nome", source = "autor")
    @Mapping(target = "editora.nome", source = "editora")
    @Mapping(target = "genero.nome", source = "genero")
    LivroEntity toEntity(LivroRequestDTO livro);
}
