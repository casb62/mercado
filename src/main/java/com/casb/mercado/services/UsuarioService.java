package com.casb.mercado.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casb.mercado.domain.Usuario;
import com.casb.mercado.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario buscar(Long id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElse(null);
	}
}