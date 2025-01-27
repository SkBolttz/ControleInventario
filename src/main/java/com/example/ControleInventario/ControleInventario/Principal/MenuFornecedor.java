package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

public class MenuFornecedor {
    
    private Scanner sc = new Scanner(System.in);
    
    public void exibirMenuFornecedor() {
        System.out.println("1 - Cadastrar Fornecedor");
        System.out.println("2 - Listar Fornecedor");
        System.out.println("3 - Buscar Fornecedor");
        System.out.println("4 - Atualizar Fornecedor");
        System.out.println("5 - Excluir Fornecedor");
        System.out.println("6 - Voltar para o Menu Principal");

        int opcao = sc.nextInt();
        sc.nextLine();
    }
}
