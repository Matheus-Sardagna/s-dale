package com.entra21.primeiroprojetospring.model.entity;

import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "livro")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class LivroEntity extends ItemEntity {

    @Column(name = "autor")
    private String autor;

    @Column(name = "qntePaginas")
    private Integer qntePagina;

    @Column(name = "ano_Publicacao")
    private Integer anoPublicacao;

    @Column(name = "edicao")
    private Integer edicao;

    @Column(name = "id_item")
    private Long itemId;



    }


