package com.estudo.spring.biblioteca.adapter.output.livro.database.entity;

import com.estudo.spring.biblioteca.domain.model.enums.PaisEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_ILUSTRADOR")
public class IlustradorEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ILUSTRADOR_ID")
    private Long id;

    @Column(name = "ILUSTRADOR_NOME")
    private String nome;


    @Column(name = "NATURALIDADE")
    private PaisEnum naturalidade;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNasciemtno;

    @OneToMany(mappedBy = "ilustrador")
    private Set<GraphicNovelEntity> graphicNovelList;

}
