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

import br.edu.infnet.appGeracaoPropostas.model.domain.Comercial;
import br.edu.infnet.appGeracaoPropostas.model.service.ComercialService;

@RestController
@RequestMapping("/api/comercial")
public class ComercialController {
	
	@Autowired
	private ComercialService comercialService;
	
	@GetMapping(value = "/listar")
	public List<Comercial> obterLista() {
		return (List<Comercial>) comercialService.obterLista();
	}
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Comercial comercial) {
		comercialService.incluir(comercial);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		comercialService.excluir(id);
	}
}
