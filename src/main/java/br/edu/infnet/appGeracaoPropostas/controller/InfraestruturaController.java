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

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.service.InfraestruturaService;

@RestController
@RequestMapping("/api/infraestrutura")
public class InfraestruturaController {
	
	@Autowired
	private InfraestruturaService infraestruturaService;
	
	@GetMapping(value = "/listar")
	public List<Infraestrutura> obterLista() {
		return (List<Infraestrutura>) infraestruturaService.obterLista();
	}
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Infraestrutura infraestrutura) {
		infraestruturaService.incluir(infraestrutura);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		infraestruturaService.excluir(id);
	}
}
