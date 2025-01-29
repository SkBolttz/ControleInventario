package com.example.ControleInventario.ControleInventario.Services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Categoria categoria = new Categoria();
        categoria.setNome(sc.nextLine());

        if (categoriaRepository.findByNome(categoria.getNome()) != null) {
            categoria.setId(((Categoria) categoriaRepository.findByNome(categoria.getNome())).getId());
            fornecedorRepository.save(fornecedor);
            System.out.println("Fornecedor cadastrado!");
        } else {
            System.out.println("Categoria nao encontrada!");
            return;
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
            for (Fornecedor f : fornecedorRepository.findAll()) {
                System.out.println(f);
            }
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
}
