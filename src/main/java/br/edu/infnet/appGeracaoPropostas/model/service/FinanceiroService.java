package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Financeiro;

@Service
public class FinanceiroService {

	private Map<String, Financeiro> mapa = new HashMap<String, Financeiro>();
	
	public void incluir(Financeiro financeiro) {
		mapa.put(financeiro.getEmail(), financeiro);
	}
	
	public Collection<Financeiro> obterLista() {
		return mapa.values();
	}
}
