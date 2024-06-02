package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TB_GRAPHICNOVEL")
public class GraphicNovelEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GRAPHICNOVEL_ID")
    private Long id;

    @Column(name = "TITULO_GRAPHICNOVEL")
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "AUTOR_ID", nullable = false )
    private AutorEntity autor;

    @ManyToOne
    @JoinColumn(name = "ILUSTRADOR_ID", nullable = false )
    private IlustradorEntity ilustrador;

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
