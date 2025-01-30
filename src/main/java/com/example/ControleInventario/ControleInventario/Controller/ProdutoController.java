package com.example.ControleInventario.ControleInventario.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleInventario.ControleInventario.DTO.ProdutoDTO;
import com.example.ControleInventario.ControleInventario.Entities.Produto;
import com.example.ControleInventario.ControleInventario.Services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoDTO> findAll() {
        List<Produto> produtos = produtoService.listProduto();
        return produtos.stream().map(ProdutoDTO::new).toList();
    }

    @GetMapping(value = "/{nomeProduto}")
    public ResponseEntity<ProdutoDTO> findByNome(@PathVariable String nomeProduto) {
        Produto p = produtoService.FindByNome(nomeProduto);
        ProdutoDTO pDTO = new ProdutoDTO(p);
        if (p != null) {
            return ResponseEntity.ok(pDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
