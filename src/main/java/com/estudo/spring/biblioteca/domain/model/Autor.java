package com.estudo.spring.biblioteca.domain.model;

import com.estudo.spring.biblioteca.domain.model.enums.PaisEnum;

import java.time.LocalDate;

public record Autor(
        String nome,
        PaisEnum naturalidade,
        LocalDate dataNasciemtno,
        Genero genero
) {
}
