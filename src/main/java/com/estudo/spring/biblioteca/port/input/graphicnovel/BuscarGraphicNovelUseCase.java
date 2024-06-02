package com.estudo.spring.biblioteca.port.input.graphicnovel;

import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;

import java.time.LocalDate;
import java.util.List;

public interface BuscarGraphicNovelUseCase {
    LivroEntity erxecutarPorId(Integer id);
    List<LivroEntity> executarPorFiltros(String nome, String autor, LocalDate dataPublicacao);
}
