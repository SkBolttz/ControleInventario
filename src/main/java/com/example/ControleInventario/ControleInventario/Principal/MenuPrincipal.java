package com.example.ControleInventario.ControleInventario.Principal;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MenuPrincipal {
    
    private Scanner sc = new Scanner(System.in);

    @Autowired
    private MenuCategoria menuCategoria;

    @Autowired
    private MenuProduto menuProduto;

    @Autowired
    private MenuFornecedor menuFornecedor;

    public void exibirMenuPrincipal(){

        System.out.println("Selecione uma das opções abaixo:");

        System.out.println("1 - Menu Categoria:");
        System.out.println("2 - Menu Fornecedor:");
        System.out.println("3 - Menu Produto:");

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
            default:
                System.out.println("Opção invalida!");
                return;
        }
    }
}
