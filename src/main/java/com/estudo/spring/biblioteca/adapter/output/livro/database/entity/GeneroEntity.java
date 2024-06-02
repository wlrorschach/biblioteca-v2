package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_GENERO")
public class GeneroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GENERO_ID")
    private Long id;

    @Column(name = "GENERO_NOME")
    private String nome;

    @OneToMany(mappedBy = "genero")
    private Set<LivroEntity> livroList;

    @OneToMany(mappedBy = "genero")
    private Set<GraphicNovelEntity> graphicNovelList;

}
