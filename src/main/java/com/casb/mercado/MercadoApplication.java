package com.casb.mercado;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.casb.mercado.domain.Produto;
import com.casb.mercado.repositories.ProdutoRepository;

@SpringBootApplication
public class MercadoApplication implements CommandLineRunner{
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MercadoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto(null,"Arroz","Pacote de 5 kg",32.00,1000,true);
		Produto p2 = new Produto(null,"Feijão","Pacote de 2 kg",16.00,1000,true);
		Produto p3 = new Produto(null,"Oleo","Embalagem de 900 ml",8.60,1000,true);
		Produto p4 = new Produto(null,"Farinha de mandioca","Pacote de 1 kg",6.30,1000,true);
		Produto p5 = new Produto(null,"Farinha de milho","Pacote de 1 kg",5.90,1000,true);
		Produto p6 = new Produto(null,"Sal","Pacote de 1 kg",3.20,1000,true);
		Produto p7 = new Produto(null,"Carne seca","Pacote de 500 g",22.50,500,true);
		Produto p8 = new Produto(null,"Bombril","Pacote com 6 unidades",5.60,500,true);
		Produto p9 = new Produto(null,"Pimenta do reino","Pacote de 50 g",4.80,500,true);
		Produto p10 = new Produto(null,"Grao de bico","Pacote de 500 g",12.00,500,true);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
	}
}