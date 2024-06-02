package com.estudo.spring.biblioteca.port.output;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;

import java.util.Optional;

public interface CadastrarLivroPort {
    Optional<LivroEntity> executar(LivroRequestDTO livro);
}
