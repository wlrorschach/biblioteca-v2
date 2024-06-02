package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_EDITORA")
public class EditoraEntity implements Serializable {

    @Id
    @Column(name = "EDITORA_ID")
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "EDITORA_NOME")
    private String nome;

    @Column(name = "ANO_FUNCACAO")
    private LocalDate anoFundacao;

    @OneToMany(mappedBy = "editora")
    private Set<LivroEntity> livroList;

    @OneToMany(mappedBy = "editora")
    private List<GraphicNovelEntity> graphicNovelList;
}
