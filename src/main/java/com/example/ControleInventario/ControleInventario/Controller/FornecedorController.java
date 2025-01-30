package com.example.ControleInventario.ControleInventario.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;
import com.example.ControleInventario.ControleInventario.Services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {
    
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public List<Fornecedor> findAll(){
        return fornecedorService.listFornecedor();
    }

    @GetMapping(value = "/{nomeFornecedor}")
    public ResponseEntity<Fornecedor> findByNome(@PathVariable String nomeFornecedor) {
        Fornecedor f = fornecedorService.FindByNome(nomeFornecedor);

        if(f != null) {
            return ResponseEntity.ok(f);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
