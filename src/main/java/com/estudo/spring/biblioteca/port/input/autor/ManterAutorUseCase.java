package com.estudo.spring.biblioteca.port.input.autor;

import com.estudo.spring.biblioteca.domain.model.Autor;

import java.util.Optional;

public interface ManterAutorUseCase {
    Optional<Autor> cadastrarAutor(Autor autor);

    Optional<Autor> alterarAutor(Autor autor);

    boolean deletarAutor();
}
