package com.estudo.spring.biblioteca.adapter.input.api.livro.dto.resquest;

import java.time.LocalDate;

public record LivroRequestDTO(
        Long id,
        String titulo,
        String autor,
        String genero,
        String isbn,
        String editora,
        LocalDate dataPublicacao
) {
}
