package com.example.ControleInventario.ControleInventario.Principal;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuPrincipal {

    private final Scanner sc;
    private final MenuCategoria menuCategoria;
    private final MenuFornecedor menuFornecedor;
    private final MenuProduto menuProduto;

    @Autowired
    public MenuPrincipal(MenuCategoria menuCategoria, MenuFornecedor menuFornecedor, MenuProduto menuProduto) {
        this.sc = new Scanner(System.in);
        this.menuCategoria = menuCategoria;
        this.menuFornecedor = menuFornecedor;
        this.menuProduto = menuProduto;
    }

    public void exibirMenuPrincipal() {
        while (true) {
            System.out.println("Selecione uma das opções abaixo:");

            System.out.println("1 - Menu Categoria:");
            System.out.println("2 - Menu Fornecedor:");
            System.out.println("3 - Menu Produto:");
            System.out.println("0 - Sair do Programa:");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuCategoria.menuCategoria();
                    break;
                case 2:
                    menuFornecedor.exibirMenuFornecedor();
                    break;
                case 3:
                    menuProduto.menuProduto();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção invalida!");
                    return;
            }
        }
    }
}
