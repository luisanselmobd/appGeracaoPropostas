package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Produto;
import br.edu.infnet.appGeracaoPropostas.model.service.ProdutoService;
@Order(6)
@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private ProdutoService produtoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/produto.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 3) {
				Produto produto = new Produto(informacoes[0], informacoes[1], informacoes[2]);
				produtoService.incluir(produto);
			}
			linha = leitura.readLine();
		}
		
		for(Produto produto : produtoService.obterLista()) {
			System.out.println("PRODUTO: " + produto);
		}

		leitura.close();
		
		
	}

}
