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

import br.edu.infnet.appGeracaoPropostas.model.domain.Operacional;
import br.edu.infnet.appGeracaoPropostas.model.service.OperacionalService;

@RestController
@RequestMapping("/api/operacional")
public class OperacionalController {
	
	@Autowired
	private OperacionalService operacionalService;
	
	@GetMapping(value = "/listar")
	public List<Operacional> obterLista() {
		return (List<Operacional>) operacionalService.obterLista();
	}
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Operacional operacional) {
		operacionalService.incluir(operacional);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		operacionalService.excluir(id);
	}
}
