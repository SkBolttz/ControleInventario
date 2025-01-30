package com.example.ControleInventario.ControleInventario.DTO;

import org.springframework.beans.BeanUtils;
import com.example.ControleInventario.ControleInventario.Entities.Produto;

public class ProdutoDTO {

    private String nome;
    private String descricao;
    private Double preco;
    private FornecedorDTO fornecedor;
    private CategoriaDTO categoria;

    public ProdutoDTO() {

    }

    public ProdutoDTO(Produto entity) {
        BeanUtils.copyProperties(entity, this);
        this.fornecedor = new FornecedorDTO(entity.getFornecedor());
        this.categoria = new CategoriaDTO(entity.getCategoria());
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public FornecedorDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorDTO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }
}
