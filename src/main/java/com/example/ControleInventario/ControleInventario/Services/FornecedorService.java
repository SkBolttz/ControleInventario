package com.example.ControleInventario.ControleInventario.Services;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;
import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;
import com.example.ControleInventario.ControleInventario.Repository.CategoriaRepository;
import com.example.ControleInventario.ControleInventario.Repository.FornecedorRepository;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    private Scanner sc = new Scanner(System.in);

    public void cadastrarFornecedor(Fornecedor fornecedor) {

        System.out.println("Informe o nome do Fornecedor: ");
        fornecedor.setNome(sc.nextLine());
        System.out.println("Informe o e-mail do Fornecedor: ");
        fornecedor.setEmail(sc.nextLine());
        System.out.println("Informe o telefone do Fornecedor: ");
        fornecedor.setTelefone(sc.nextLine());

        System.out.println("Informe a categoria do Fornecedor: ");
        String nomeCategoria = sc.nextLine();

        Categoria categoria = categoriaRepository.findByNome(nomeCategoria);

        if (categoria != null) {
            fornecedor.setCategoria(categoria);
            fornecedorRepository.save(fornecedor);
            System.out.println("Fornecedor Cadastrado!");
        } else {
            System.out.println("Categoria nao encontrada!");
        }
    }

    public void listarFornecedor() {
        System.out.println("Listando Fornecedores: \n");
        for (Fornecedor fornecedor : fornecedorRepository.findAll()) {
            System.out.println(fornecedor);
        }
    }

    public void buscarFornecedor() {
        System.out.println("Informe o nome do Fornecedor:");
        String nomeFornecedor = sc.nextLine();

        if (fornecedorRepository.findByNome(nomeFornecedor) != null) {
            System.out.println(fornecedorRepository.findByNome(nomeFornecedor).toString());
        } else {
            System.out.println("Fonecedor nao encontrado!");
        }
    }

    public void atualizaFornecedor() {
        System.out.println("Informe o nome do Fornecedor:");
        String nomeFornecedor = sc.nextLine();

        if (fornecedorRepository.findByNome(nomeFornecedor) != null) {
            Fornecedor fornecedor = new Fornecedor();
            System.out.println("Informe o novo nome do Fornecedor:");
            fornecedor.setNome(sc.nextLine());
            System.out.println("Informe o novo e-mail do Fornecedor:");
            fornecedor.setEmail(sc.nextLine());
            System.out.println("Informe o novo telefone do Fornecedor:");
            fornecedor.setTelefone(sc.nextLine());
            System.out.println("Informe a nova categoria do Fornecedor:");
            String nomeCategoria = sc.nextLine();

            Categoria categoria = categoriaRepository.findByNome(nomeCategoria);

            if (categoria != null) {
                fornecedor.setCategoria(categoria);
            } else {
                System.out.println("Categoria não encontrada!");
            }

            fornecedor.setId(((Fornecedor) fornecedorRepository.findByNome(nomeFornecedor)).getId());
            fornecedorRepository.save(fornecedor);

            System.out.println("Fornecedor Atualizado!");
        } else {
            System.out.println("Fornecedor nao encontrado!");
        }
    }

    public void excluirFornecedor() {
        System.out.println("Informe o nome do Fornecedor:");
        String nomeFornecedor = sc.nextLine();

        if (fornecedorRepository.findByNome(nomeFornecedor) != null) {
            Fornecedor fornecedor = new Fornecedor();

            fornecedor.setId(((Fornecedor) fornecedorRepository.findByNome(nomeFornecedor)).getId());
            fornecedorRepository.delete(fornecedor);

            System.out.println("Fornecedor Excluido!");
        } else {
            System.out.println("Fornecedor nao encontrado!");
        }
    }

    // Métodos para API REST

    public List<Fornecedor> listFornecedor() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor FindByNome(@PathVariable String nomeFornecedor) {
        Fornecedor f = fornecedorRepository.findByNome(nomeFornecedor);
        return f;
    }
}
