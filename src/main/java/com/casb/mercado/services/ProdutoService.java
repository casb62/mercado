package com.casb.mercado.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casb.mercado.domain.Produto;
import com.casb.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public Produto buscar(Long id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}
}