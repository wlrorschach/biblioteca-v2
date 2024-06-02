package com.estudo.spring.biblioteca.adapter.input.api.livro.dto.response;

import java.time.LocalDate;

public record LivroResponseDTO(
        Long id,
        String titulo,
        LocalDate dataPublicacao,
        String autor
) {
}
