package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;

@Service
public class InfraestruturaService {

	private Map<String, Infraestrutura> mapa = new HashMap<String, Infraestrutura>();
	
	public void incluir(Infraestrutura infraestrutura) {
		mapa.put(infraestrutura.getNome(), infraestrutura);
	}
	
	public Collection<Infraestrutura> obterLista() {
		return mapa.values();
	}
}
