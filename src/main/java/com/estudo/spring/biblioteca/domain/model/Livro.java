package com.estudo.spring.biblioteca.domain.model;

import java.time.LocalDate;

public record Livro(
        String titulo,
        Autor autor,
        LocalDate dataPublicacao,
        Genero genero,
        SubGenero subGenero,
        String isbn,
        Editora editora

) {
}
