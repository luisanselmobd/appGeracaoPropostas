package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Financeiro;
import br.edu.infnet.appGeracaoPropostas.model.repositories.FinanceiroRepository;

@Service
public class FinanceiroService {

	@Autowired
	private FinanceiroRepository financeiroRepository;	
	
	public void incluir(Financeiro financeiro) {
		financeiroRepository.save(financeiro);
	}
	
	public Collection<Financeiro> obterLista() {
		return (Collection<Financeiro>) financeiroRepository.findAll();
	}
}
