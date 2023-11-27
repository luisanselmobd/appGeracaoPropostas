package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Operacional;

@Service
public class OperacionalService {

	private Map<String, Operacional> mapa = new HashMap<String, Operacional>();
	
	public void incluir(Operacional operacional) {
		mapa.put(operacional.getEmail(), operacional);
	}
	
	public Collection<Operacional> obterLista() {
		return mapa.values();
	}
}
