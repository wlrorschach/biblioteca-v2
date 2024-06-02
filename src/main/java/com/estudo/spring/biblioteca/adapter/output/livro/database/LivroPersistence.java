package com.estudo.spring.biblioteca.adapter.output.livro.database;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.mapper.LivroMapper;
import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;
import com.estudo.spring.biblioteca.adapter.output.livro.database.repository.LivroRepository;
import com.estudo.spring.biblioteca.port.output.BuscarLivroPort;
import com.estudo.spring.biblioteca.port.output.CadastrarLivroPort;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public record LivroPersistence(
        LivroRepository livroRepository,
        LivroMapper mapper
) implements BuscarLivroPort, CadastrarLivroPort {
    /**
     * @param id
     * @return
     */
    @Override
    public Optional<LivroEntity> erxecutarPorId(Integer id) {
        return livroRepository.findById(id);
    }

    /**
     * @param nome, autor, dataPublicacao
     * @return
     */
    @Override
    public Optional<List<LivroEntity>> executarPorFiltros(String nome, String autor, LocalDate dataPublicacao) {
        return livroRepository.buscarLivrosPorFiltro(nome, autor, dataPublicacao);
    }

    /**
     * @param livro
     * @return
     */
    @Override
    public Optional<LivroEntity> executar(LivroRequestDTO livro) {
        return Optional.of(livroRepository.save(mapper.toEntity(livro)));
    }
}

