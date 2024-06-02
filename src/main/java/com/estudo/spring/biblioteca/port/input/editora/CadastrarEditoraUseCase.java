package com.estudo.spring.biblioteca.port.input.editora;

import com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest.LivroRequestDTO;
import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;

public interface CadastrarEditoraUseCase {
    LivroEntity cadastrar(LivroRequestDTO livro);
}
