package com.example.ControleInventario.ControleInventario.Entities;
import java.util.Objects;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String nome;
    @Column(unique = true)
    private String email;
    private String telefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fornecedor_id")
    private List<Produto> produto;

    public Fornecedor(){}

    public Fornecedor(long id, String nome, String email, String telefone, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fornecedor other = (Fornecedor) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \n" +    
                             "Email: %s \n" +    
                             "Telefone: %s \n" +
                             "----------------------------------\n", nome, email, telefone);
    }
}
