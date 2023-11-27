package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Projeto;

@Service
public class ProjetoService {

	private Map<String, Projeto> mapa = new HashMap<String, Projeto>();
	
	public void incluir(Projeto projeto) {
		mapa.put(projeto.getIdentificacao(), projeto);
	}
	
	public Collection<Projeto> obterLista() {
		return mapa.values();
	}
}
