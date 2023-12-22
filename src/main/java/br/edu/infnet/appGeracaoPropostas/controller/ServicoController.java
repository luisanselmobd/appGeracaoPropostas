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

import br.edu.infnet.appGeracaoPropostas.model.domain.Servico;
import br.edu.infnet.appGeracaoPropostas.model.service.ServicoService;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {
	
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/listar")
	public List<Servico> obterLista() {
		return (List<Servico>) servicoService.obterLista();
	}
	
	@GetMapping(value = "/obterItensAleatorios")
	public List<Servico>  obterItemAleatorio() {
		return (List<Servico> ) servicoService.obterItensAleatorios();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Servico servico) {
		servicoService.incluir(servico);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		servicoService.excluir(id);
	}
}
