package com.example.ControleInventario.ControleInventario.Controller;

import java.beans.BeanProperty;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;
import com.example.ControleInventario.ControleInventario.Services.CategoriaService;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {
    
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> findAll(){
        return categoriaService.listCategory();
    }

    @GetMapping(value = "/{nomeCategoria}")
    public ResponseEntity<Categoria> findByNome(@PathVariable String nomeCategoria) {
        Categoria categoria = categoriaService.findByNome(nomeCategoria);
        
        if(categoria != null) {
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
