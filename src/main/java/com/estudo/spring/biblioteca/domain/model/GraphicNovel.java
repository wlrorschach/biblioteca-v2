package com.estudo.spring.biblioteca.domain.model;

import java.time.LocalDate;

public record GraphicNovel(
        String titulo,
        Autor autor,
        Ilustrador ilustrador,
        LocalDate dataPublicacao,
        Genero genero,
        SubGenero subGenero,
        String isbn,
        Editora editora
) {
}
