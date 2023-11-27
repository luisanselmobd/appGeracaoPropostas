package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Servico;

@Service
public class ServicoService {

	private Map<String, Servico> mapa = new HashMap<String, Servico>();
	
	public void incluir(Servico servico) {
		mapa.put(servico.getNome(), servico);
	}
	
	public Collection<Servico> obterLista() {
		return mapa.values();
	}
}
