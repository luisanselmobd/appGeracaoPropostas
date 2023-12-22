package br.edu.infnet.appGeracaoPropostas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;
import br.edu.infnet.appGeracaoPropostas.model.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value = "/listar")
	public List<Cliente> obterLista() {
		return (List<Cliente>) clienteService.obterLista();
	}
	
	@GetMapping(value = "/obterItemAleatorio")
	public Cliente obterItemAleatorio() {
		return (Cliente) clienteService.obterItemAleatorio();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		clienteService.incluir(cliente);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		clienteService.excluir(id);
	}
}
