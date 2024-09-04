package com.casb.mercado.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.casb.mercado.domain.Venda;
import com.casb.mercado.services.VendaService;

@RestController
@RequestMapping(value="/vendas")
public class VendaResource {

	@Autowired
	private VendaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		
		Venda obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
