package com.example.ControleInventario.ControleInventario.DTO;

import org.springframework.beans.BeanUtils;

import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;

public class FornecedorDTO {

    private String nome;
    private String email;
    private String telefone;
    private CategoriaDTO categoria;

    public FornecedorDTO() {

    }

    public FornecedorDTO(Fornecedor entity) {
        BeanUtils.copyProperties(entity, this);
        this.categoria = new CategoriaDTO(entity.getCategoria());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }
}
