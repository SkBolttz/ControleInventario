package com.example.ControleInventario.ControleInventario.DTO;

import org.springframework.beans.BeanUtils;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;

public class CategoriaDTO {

    private String nome;
    private String descricao;

    public CategoriaDTO() {

    }

    public CategoriaDTO(Categoria entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
