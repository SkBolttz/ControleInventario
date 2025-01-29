package com.example.ControleInventario.ControleInventario.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControleInventario.ControleInventario.Repository.FornecedorRepository;

@Service
public class FornecedorService {
    
    @Autowired
    private FornecedorRepository fornecedorRepository;
}
