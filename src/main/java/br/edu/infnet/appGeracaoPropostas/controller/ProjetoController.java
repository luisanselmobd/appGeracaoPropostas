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

import br.edu.infnet.appGeracaoPropostas.model.domain.Projeto;
import br.edu.infnet.appGeracaoPropostas.model.service.ProjetoService;

@RestController
@RequestMapping("/api/projeto")
public class ProjetoController {
	
	@Autowired
	private ProjetoService projetoService;
	
	@GetMapping(value = "/listar")
	public List<Projeto> obterLista() {
		return (List<Projeto>) projetoService.obterLista();
	}
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Projeto projeto) {
		projetoService.incluir(projeto);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		projetoService.excluir(id);
	}
}
