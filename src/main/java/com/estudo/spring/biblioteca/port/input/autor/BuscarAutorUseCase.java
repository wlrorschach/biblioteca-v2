package com.estudo.spring.biblioteca.port.input.autor;

import com.estudo.spring.biblioteca.domain.model.Autor;
import com.estudo.spring.biblioteca.domain.model.Genero;
import com.estudo.spring.biblioteca.domain.model.enums.PaisEnum;

import java.time.LocalDate;
import java.util.List;

public interface BuscarAutorUseCase {
    Autor buscarPorId(Integer id);
    List<Autor> buscarPorFiltros(String nome, PaisEnum naturalidade, LocalDate dataNasciemtno, Genero genero);
}
