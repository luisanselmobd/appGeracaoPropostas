package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Comercial;

@Service
public class ComercialService {

	private Map<String, Comercial> mapa = new HashMap<String, Comercial>();
	
	public void incluir(Comercial comercial) {
		mapa.put(comercial.getEmail(), comercial);
	}
	
	public Collection<Comercial> obterLista() {
		return mapa.values();
	}
}
