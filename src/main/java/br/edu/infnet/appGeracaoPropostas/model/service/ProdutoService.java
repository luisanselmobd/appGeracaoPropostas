package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Produto;

@Service
public class ProdutoService {

	private Map<String, Produto> mapa = new HashMap<String, Produto>();
	
	public void incluir(Produto produto) {
		mapa.put(produto.getNome(), produto);
	}
	
	public Collection<Produto> obterLista() {
		return mapa.values();
	}
}
