package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Produto;
import br.edu.infnet.appGeracaoPropostas.model.domain.Servico;
import br.edu.infnet.appGeracaoPropostas.model.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;	
	
	public void incluir(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public Collection<Produto> obterLista() {
		return (Collection<Produto>) produtoRepository.findAll();
	}
	
	public List<Produto> obterItensAleatorios() {
	    List<Produto> produtos = (List<Produto>) produtoRepository.findAll();

	    if (produtos.isEmpty()) {
	        return null;
	    }

	    Random random = new Random();
	    int quantidadeAleatoria = random.nextInt(produtos.size());

	    return produtos.subList(0, quantidadeAleatoria);
			    
	}
}