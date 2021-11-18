package br.com.meuprimeirorest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meuprimeirorest.dto.Cliente;

@RestController
public class ClientesController {

	@PostMapping(path = "clientes/novo", consumes = "application/json")
	public void novoCliente(@RequestBody Cliente cliente) {
		System.out.println("Nome do cliente: "+cliente.getNome()+" "+cliente.getSobrenome());
	}
	
}
