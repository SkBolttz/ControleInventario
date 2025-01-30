package com.example.ControleInventario.ControleInventario.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleInventario.ControleInventario.DTO.CategoriaDTO;
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
    public List<CategoriaDTO> findAll() {
        List<Categoria> categorias = categoriaService.listCategory();
        return categorias.stream().map(CategoriaDTO::new).toList();
    }

    @GetMapping(value = "/{nomeCategoria}")
    public ResponseEntity<CategoriaDTO> findByNome(@PathVariable String nomeCategoria) {
        Categoria categoria = categoriaService.findByNome(nomeCategoria);
        CategoriaDTO categoriaDTO = new CategoriaDTO(categoria);

        if (categoria != null) {
            return ResponseEntity.ok(categoriaDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
