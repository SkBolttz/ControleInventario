package com.example.ControleInventario.ControleInventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ControleInventario.ControleInventario.Principal.MenuFornecedor;

@SpringBootApplication
public class ControleInventarioApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ControleInventarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		MenuFornecedor menu = new MenuFornecedor();
		menu.exibirMenuFornecedor();
	}

}
