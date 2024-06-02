package com.estudo.spring.biblioteca.domain.service;

import com.estudo.spring.biblioteca.domain.model.Autor;
import com.estudo.spring.biblioteca.domain.model.Genero;
import com.estudo.spring.biblioteca.domain.model.enums.PaisEnum;
import com.estudo.spring.biblioteca.port.input.autor.BuscarAutorUseCase;
import com.estudo.spring.biblioteca.port.input.autor.ManterAutorUseCase;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public record AutorService() implements ManterAutorUseCase, BuscarAutorUseCase {
    /**
     * @param id
     * @return
     */
    @Override
    public Autor buscarPorId(Integer id) {
        return null;
    }

    /**
     * @param nome
     * @param naturalidade
     * @param dataNasciemtno
     * @param genero
     * @return
     */
    @Override
    public List<Autor> buscarPorFiltros(String nome, PaisEnum naturalidade, LocalDate dataNasciemtno, Genero genero) {
        return List.of();
    }

    /**
     * @param autor
     * @return
     */
    @Override
    public Optional<Autor> cadastrarAutor(Autor autor) {
        return Optional.empty();
    }

    /**
     * @param autor
     * @return
     */
    @Override
    public Optional<Autor> alterarAutor(Autor autor) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public boolean deletarAutor() {
        return false;
    }
}
