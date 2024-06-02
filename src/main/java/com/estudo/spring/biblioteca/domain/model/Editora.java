package com.estudo.spring.biblioteca.domain.model;

import java.time.LocalDate;

public record Editora(
        String nome,
        LocalDate anoFundacao
) {
}
