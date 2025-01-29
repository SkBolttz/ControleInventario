package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class MenuProduto {

    private Scanner sc = new Scanner(System.in);

    public void menuProduto() {
        System.out.println("!---------------------------------------!");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Buscar Produto");
        System.out.println("4 - Atualizar Produto");
        System.out.println("5 - Excluir Produto");
        System.out.println("6 - Voltar para o Menu Principal");
        System.out.println("!---------------------------------------!");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar Produto");
                cadastrarProduto();
                break;
            case 2:
                System.out.println("Listar Produto");
                listarProduto();
                break;
            case 3:
                System.out.println("Buscar Produto");
                buscarProduto();
                break;
            case 4:
                System.out.println("Atualizar Produto");
                atualizarProduto();
                break;
            case 5:
                System.out.println("Excluir Produto");
                excluirProduto();
                break;
            case 6:
                System.out.println("Voltar para o Menu Principal");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }

    private void cadastrarProduto() {

    }

    private void listarProduto() {

    }

    private void buscarProduto() {

    }

    private void atualizarProduto() {

    }

    private void excluirProduto() {

    }

}
