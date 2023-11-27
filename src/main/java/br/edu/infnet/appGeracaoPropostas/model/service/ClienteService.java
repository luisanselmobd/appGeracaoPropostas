package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;

@Service
public class ClienteService {

	private Map<String, Cliente> mapa = new HashMap<String, Cliente>();
	
	public void incluir(Cliente cliente) {
		mapa.put(cliente.getNome(), cliente);
	}
	
	public Collection<Cliente> obterLista() {
		return mapa.values();
	}
}
