package com.example.ControleInventario.ControleInventario.Services;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ControleInventario.ControleInventario.Entities.Categoria;
import com.example.ControleInventario.ControleInventario.Entities.Fornecedor;
import com.example.ControleInventario.ControleInventario.Entities.Produto;
import com.example.ControleInventario.ControleInventario.Repository.CategoriaRepository;
import com.example.ControleInventario.ControleInventario.Repository.FornecedorRepository;
import com.example.ControleInventario.ControleInventario.Repository.ProdutoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private FornecedorRepository fornecedorRepository;

    private Scanner sc = new Scanner(System.in);

    public void cadastrarProduto(Produto produto) {
        System.out.println("Informe o nome do Produto:");
        produto.setNome(sc.nextLine());
        System.out.println("Informe a descrição do Produto:");
        produto.setDescricao(sc.nextLine());
        System.out.println("Informe o preço do produto:");
        produto.setPreco(sc.nextDouble());
        System.out.println("Informe a quantidade em estoque:");
        produto.setQuantidadeEmEstoque(sc.nextInt());
        sc.nextLine();
        System.out.println("Informe a categoria do Produto:");
        String nomeCategoria = sc.nextLine();

        Categoria categoria = categoriaRepository.findByNome(nomeCategoria);
        if (categoria != null) {
            categoria.setId(categoriaRepository.findByNome(nomeCategoria).getId());
            produto.setCategoria(categoria);
            produtoRepository.save(produto);
        } else {
            System.out.println("Categoria não encotrada!");
        }

        System.out.println("Informe o fornecedor do Produto:");
        String nomeFornecedor = sc.nextLine();

        Fornecedor fornecedor = fornecedorRepository.findByNome(nomeFornecedor);

        if (fornecedor != null) {
            produto.setFornecedor(fornecedor);
        } else {
            System.out.println("Fornecedor não encontrado!");
        }

        produtoRepository.save(produto);
        System.out.println("Produto cadastrado!");
    }

    public void listarProduto() {
        System.out.println("Produtos:");
        for (Produto produto : produtoRepository.findAll()) {
            System.out.println(produto);
        }
    }

    public void buscarProduto() {
        System.out.println("Informe o nome do produto:");
        String nomeProduto = sc.nextLine();

        if (produtoRepository.findByNome(nomeProduto) != null) {
            System.out.println(produtoRepository.findByNome(nomeProduto).toString());
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    @Transactional
    public void atualizarProduto() {
        System.out.println("Informe o nome do produto:");
        String nomeProduto = sc.nextLine();

        Produto produto = produtoRepository.findByNome(nomeProduto);

        if (produto != null) {
            System.out.println("Novo nome do produto:");
            produto.setNome(sc.nextLine());
            System.out.println("Nova descrição do produto:");
            produto.setDescricao(sc.nextLine());
            System.out.println("Novo preco do produto:");
            produto.setPreco(sc.nextDouble());
            System.out.println("Nova quantidade em estoque:");
            produto.setQuantidadeEmEstoque(sc.nextInt());
            System.out.println("Nova categoria do produto:");
            String nomeCategoria = sc.nextLine();

            Categoria categoria = categoriaRepository.findByNome(nomeCategoria);

            if (categoria != null) {
                produto.setCategoria(categoria);
            } else {
                System.out.println("Categoria nao encontrada!");
            }

            System.out.println("Novo fornecedor do produto:");
            String nomeFornecedor = sc.nextLine();

            Fornecedor fornecedor = fornecedorRepository.findByNome(nomeFornecedor);

            if (fornecedor != null) {
                produto.setId(produtoRepository.findByNome(nomeProduto).getId());
            } else {
                System.out.println("Fornecedor nao encontrado!");
            }

            produto.setId(produto.getId());
            produtoRepository.save(produto);
            System.out.println("Produto atualizado!");
        }
    }

    @Transactional
    public void excluirProduto() {
        System.out.println("Informe o nome do produto:");
        String nomeProduto = sc.nextLine();

        Produto produto = produtoRepository.findByNome(nomeProduto);

        if (produto != null) {
            produto.setId(produtoRepository.findByNome(nomeProduto).getId());

            produtoRepository.deleteById(produto.getId());
            System.out.println("Produto excluido!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    // Método para API REST

    public List<Produto> listProduto() {
        return produtoRepository.findAll();
    }

    public Produto FindByNome(@PathVariable String nomeProduto) {
        Produto p = produtoRepository.findByNome(nomeProduto);
        return p;
    }
}
