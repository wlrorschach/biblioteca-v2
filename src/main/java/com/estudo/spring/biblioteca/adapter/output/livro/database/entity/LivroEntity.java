package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_LIVRO")
public class LivroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LIVRO_ID")
    private Long id;

    @Column(name = "TITULO_LIVRO")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "AUTOR_ID", nullable = false)
    private AutorEntity autor;

    @Column(name = "DATA_PUBLICACAO")
    private LocalDate dataPublicacao;

    @ManyToOne
    @JoinColumn(name = "GENERO_ID", nullable = false)
    private GeneroEntity genero;

    @ManyToOne
    @JoinColumn(name = "SUB_GENERO_ID", nullable = false)
    private SubGeneroEntity subGenero;

    @Column(name = "COD_ISBN")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "EDITORA_ID", nullable = false)
    private EditoraEntity editora;
}
