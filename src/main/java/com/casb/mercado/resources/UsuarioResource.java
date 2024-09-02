package com.casb.mercado.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.casb.mercado.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario u1 = new Usuario(1L,"cassio","cassio");
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(u1);
		
		return lista;
	}
}
