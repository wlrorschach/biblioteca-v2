package com.estudo.spring.biblioteca.port.input.livro;

import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;

import java.time.LocalDate;
import java.util.List;

public interface BuscarLivroUseCase {
    LivroEntity erxecutarPorId(Long id);
    List<LivroEntity> executarPorFiltros(String nome, String autor, LocalDate dataPublicacao);
}
