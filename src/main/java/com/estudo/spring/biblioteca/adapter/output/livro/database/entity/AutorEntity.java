package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import com.estudo.spring.biblioteca.domain.model.enums.PaisEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_AUTOR")
public class AutorEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AUTOR_ID")
    private Long id;

    @Column(name = "NOME_AUTOR")
    private String nome;

    @Column(name = "NATURALIDADE")
    private PaisEnum naturalidade;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNasciemtno;

    @Column(name = "GENERO")
    private GeneroEntity genero;

    @OneToMany(mappedBy = "autor")
    private Set<LivroEntity> livroList;

    @OneToMany(mappedBy = "autor")
    private Set<GraphicNovelEntity> graphicNovelList;
}
