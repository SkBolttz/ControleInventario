package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;
import com.example.ControleInventario.ControleInventario.Services.CategoriaService;

@Component
public class MenuCategoria {

    private Scanner sc = new Scanner(System.in);

    @Autowired
    private CategoriaService categoriaService;

    public void menuCategoria() {
        System.out.println("!---------------------------------------!");
        System.out.println("1 - Cadastrar Categoria");
        System.out.println("2 - Listar Categoria");
        System.out.println("3 - Buscar Categoria");
        System.out.println("4 - Atualizar Categoria");
        System.out.println("5 - Excluir Categoria");
        System.out.println("6 - Voltar para o Menu Principal");
        System.out.println("!---------------------------------------!");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                categoriaService.salvarCategoria(new Categoria());
                break;
            case 2:
                categoriaService.listarCategoria();
                break;
            case 3:
                categoriaService.buscarCategoria();
                break;
            case 4:
                categoriaService.atualizarCategoria();
                break;
            case 5:
                categoriaService.excluirCategoria();
                break;
            case 6:
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }
}
