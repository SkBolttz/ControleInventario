package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;
import com.example.ControleInventario.ControleInventario.Services.FornecedorService;

@Component
public class MenuFornecedor {

    private Scanner sc = new Scanner(System.in);

    @Autowired
    private FornecedorService fornecedorService;

    public void exibirMenuFornecedor() {
        System.out.println("!---------------------------------------!");
        System.out.println("1 - Cadastrar Fornecedor");
        System.out.println("2 - Listar Fornecedor");
        System.out.println("3 - Buscar Fornecedor");
        System.out.println("4 - Atualizar Fornecedor");
        System.out.println("5 - Excluir Fornecedor");
        System.out.println("6 - Voltar para o Menu Principal");
        System.out.println("!---------------------------------------!");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                fornecedorService.cadastrarFornecedor(new Fornecedor());
                break;
            case 2:
                fornecedorService.listarFornecedor();
                break;
            case 3:
                fornecedorService.buscarFornecedor();
                break;
            case 4:
                fornecedorService.atualizaFornecedor();
                break;
            case 5:
                fornecedorService.excluirFornecedor();
                break;
            case 6:
                System.out.println("Voltar para o Menu Principal");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }
}
