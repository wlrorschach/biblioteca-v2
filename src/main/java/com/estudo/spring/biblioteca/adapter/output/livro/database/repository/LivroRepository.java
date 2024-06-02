package com.estudo.spring.biblioteca.adapter.output.livro.database.repository;

import com.estudo.spring.biblioteca.adapter.output.livro.database.entity.LivroEntity;
import com.estudo.spring.biblioteca.adapter.output.livro.database.queryes.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Integer> {

    @Query(value = Queries.LIVRO_POR_FILTRO, nativeQuery = true)
    Optional<List<LivroEntity>> buscarLivrosPorFiltro(
            @Param(value = "nome") String nome,
            @Param(value = "autor") String autor,
            @Param(value = "dataPublicacao") LocalDate dataPublicacao);


}