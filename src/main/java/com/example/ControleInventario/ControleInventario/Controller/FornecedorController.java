package com.example.ControleInventario.ControleInventario.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ControleInventario.ControleInventario.DTO.FornecedorDTO;
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
    public List<FornecedorDTO> findAll() {
        List<Fornecedor> fornecedor = fornecedorService.listFornecedor();
        return fornecedor.stream().map(FornecedorDTO::new).toList();
    }

    @GetMapping(value = "/{nomeFornecedor}")
    public ResponseEntity<FornecedorDTO> findByNome(@PathVariable String nomeFornecedor) {
        Fornecedor f = fornecedorService.FindByNome(nomeFornecedor);
        FornecedorDTO fDTO = new FornecedorDTO(f);

        if (f != null) {
            return ResponseEntity.ok(fDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
