package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class MenuCategoria {

    private Scanner sc = new Scanner(System.in);

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
                System.out.println("Cadastrar Categoria");
                cadastrarCategoria();
                break;
            case 2:
                System.out.println("Listar Categoria");
                listarCategoria();
                break;
            case 3:
                System.out.println("Buscar Categoria");
                buscarCategoria();
                break;
            case 4:
                System.out.println("Atualizar Categoria");
                atualizarCategoria();
                break;
            case 5:
                System.out.println("Excluir Categoria");
                excluirCategoria();
                break;
            case 6:
                System.out.println("Voltar para o Menu Principal");
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }

    private void cadastrarCategoria() {
    }

    private void listarCategoria() {

    }

    private void buscarCategoria() {

    }

    private void atualizarCategoria() {

    }

    private void excluirCategoria() {

    }

}
