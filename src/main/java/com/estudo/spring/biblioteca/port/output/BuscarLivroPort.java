package com.estudo.spring.biblioteca.port.output;

import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BuscarLivroPort {
    Optional<LivroEntity> erxecutarPorId(Integer id);
    Optional<List<LivroEntity>> executarPorFiltros(String nome, String autor, LocalDate dataPublicacao);
}
