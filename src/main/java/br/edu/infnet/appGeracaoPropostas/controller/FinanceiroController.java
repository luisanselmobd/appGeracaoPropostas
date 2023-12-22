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

import br.edu.infnet.appGeracaoPropostas.model.domain.Financeiro;
import br.edu.infnet.appGeracaoPropostas.model.service.FinanceiroService;

@RestController
@RequestMapping("/api/financeiro")
public class FinanceiroController {
	
	@Autowired
	private FinanceiroService financeiroService;
	
	@GetMapping(value = "/listar")
	public List<Financeiro> obterLista() {
		return (List<Financeiro>) financeiroService.obterLista();
	}
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Financeiro financeiro) {
		financeiroService.incluir(financeiro);
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		financeiroService.excluir(id);
	}
}
