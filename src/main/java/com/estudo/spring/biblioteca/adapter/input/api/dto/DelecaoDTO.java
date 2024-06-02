package com.estudo.spring.biblioteca.adapter.input.api.dto;

import java.time.LocalDate;

public record DelecaoDTO(
        Long itemDeletadoId,
        String mensagem,
        LocalDate data
) {
}
