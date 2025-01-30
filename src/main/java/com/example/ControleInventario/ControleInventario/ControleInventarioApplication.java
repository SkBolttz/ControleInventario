package com.example.ControleInventario.ControleInventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ControleInventario.ControleInventario.Principal.MenuPrincipal;

@SpringBootApplication
public class ControleInventarioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ControleInventarioApplication.class, args);
	}

	@Autowired
	private MenuPrincipal menuPrincipal;

	@Override
	public void run(String... args) throws Exception {

		menuPrincipal.exibirMenuPrincipal();
	}
}
