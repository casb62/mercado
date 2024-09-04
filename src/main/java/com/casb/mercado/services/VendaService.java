package com.casb.mercado.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casb.mercado.domain.Venda;
import com.casb.mercado.repositories.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	
	public Venda buscar(Long id) {
		Optional<Venda> obj = repo.findById(id);
		return obj.orElse(null);
	}
}