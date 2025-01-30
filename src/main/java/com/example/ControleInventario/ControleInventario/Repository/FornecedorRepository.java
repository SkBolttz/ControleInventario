package com.example.ControleInventario.ControleInventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    Fornecedor findByNome(String nomeFornecedor);
    
}
