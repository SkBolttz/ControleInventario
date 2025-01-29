package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class MenuFornecedor {

    private Scanner sc = new Scanner(System.in);

    
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
                System.out.println("Cadastrar Fornecedor");
                cadastrarFornecedor();
                break;
            case 2:
                System.out.println("Listar Fornecedor");
                listarFornecedor();
                break;
            case 3:
                System.out.println("Buscar Fornecedor");
                buscarFornecedor();
                break;
            case 4:
                System.out.println("Atualizar Fornecedor");
                atualizarFornecedor();
                break;
            case 5:
                System.out.println("Excluir Fornecedor");
                excluirFornecedor();
                break;
            case 6:
                System.out.println("Voltar para o Menu Principal");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }

    private void cadastrarFornecedor() {

    }

    private void listarFornecedor() {

    }

    private void buscarFornecedor() {

    }

    private void atualizarFornecedor() {

    }

    private void excluirFornecedor() {

    }
}
