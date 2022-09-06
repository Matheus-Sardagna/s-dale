package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "dvd")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class DvdEntity extends ItemEntity {


    @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private LocalTime duracao;

    @Column(name = "ano_Lancamento")
    private Integer anoLancamento;

    @Column(name = "id_item")
    private Long itemId;
}
