package com.example.ControleInventario.ControleInventario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findByNome(String nomeCategoria);

}
