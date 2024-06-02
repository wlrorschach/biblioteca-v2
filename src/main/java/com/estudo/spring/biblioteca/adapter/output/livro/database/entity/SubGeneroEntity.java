package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_SUB_GENERO")
public class SubGeneroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SUB_GENERO_ID")
    private Long id;

    @Column(name = "SUB_GENERO_NOME")
    private String nome;

    @OneToMany(mappedBy = "subGenero")
    private Set<LivroEntity> livroList;

    @OneToMany(mappedBy = "subGenero")
    private Set<GraphicNovelEntity> graphicNovelList;

    @ManyToOne
    @JoinColumn(name = "GENERO_ID", nullable = false)
    private GeneroEntity genero;

}
