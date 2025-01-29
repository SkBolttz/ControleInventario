package com.example.ControleInventario.ControleInventario.Services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;
import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;
import com.example.ControleInventario.ControleInventario.Repository.CategoriaRepository;
import com.example.ControleInventario.ControleInventario.Repository.FornecedorRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private Scanner sc = new Scanner(System.in);

    public void salvarCategoria(Categoria categoria) {
        System.out.println("Informe o nome da Categoria: ");
        categoria.setNome(sc.nextLine());

        System.out.println("Informe a descricao da Categoria: ");

        categoria.setDescricao(sc.nextLine());

        System.out.println("Categoria Salva!");
        categoriaRepository.save(categoria);
    }

    public void listarCategoria() {
        System.out.println("Listando Categorias: \n");
        for (Categoria categoria : categoriaRepository.findAll()) {
            System.out.println(categoria);
        }
    }

    public void buscarCategoria() {
        System.out.println("Informe o nome da Categoria que deseja procurar:");
        String nomeCategoria = sc.nextLine();

        Categoria categoria = (Categoria) categoriaRepository.findByNome(nomeCategoria);

        if (categoria != null) {
            for (Categoria c : categoriaRepository.findAll()) {
                System.out.println(c);
            }
        } else {
            System.out.println("Categoria nao encontrada!");
        }
    }

    public void atualizarCategoria() {
        System.out.println("Informe o nome da Categoria que deseja atualizar:");
        String nomeCategoria = sc.nextLine();

        if (categoriaRepository.findByNome(nomeCategoria) != null) {
            Categoria categoria = new Categoria();
            System.out.println("Informe o novo nome da Categoria:");
            categoria.setNome(sc.nextLine());
            System.out.println("Nova Descricao da Categoria:");
            categoria.setDescricao(sc.nextLine());

            categoria.setId(((Categoria) categoriaRepository.findByNome(nomeCategoria)).getId());
            categoriaRepository.save(categoria);

            System.out.println("Categoria Atualizada!");
        } else {
            System.out.println("Categoria nao encontrada!");
        }
    }

    public void excluirCategoria() {
        Categoria categoria = new Categoria();
        System.out.println("Informe o nome da categoria que deseja excluir:");
        categoria.setNome(sc.nextLine());

        if (categoriaRepository.findByNome(categoria.getNome()) != null) {
            categoria.setId(((Categoria) categoriaRepository.findByNome(categoria.getNome())).getId());
            System.out.println("Tem ceteza que deseja excluir a categoria?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    categoriaRepository.delete(categoria);
                    System.out.println("Categoria excluída!");
                    break;
                case 2:
                    System.out.println("Operação cancelada!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else {
            System.out.println("Categoria não encontrada!");
        }
    }
}
