package com.example.ControleInventario.ControleInventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ControleInventario.ControleInventario.Entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findByNome(String nomeProduto);
    
}
