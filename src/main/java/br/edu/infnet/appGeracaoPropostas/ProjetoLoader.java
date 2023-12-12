package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.domain.Projeto;
import br.edu.infnet.appGeracaoPropostas.model.service.InfraestruturaService;
import br.edu.infnet.appGeracaoPropostas.model.service.ProdutoService;
import br.edu.infnet.appGeracaoPropostas.model.service.ProjetoService;
import br.edu.infnet.appGeracaoPropostas.model.service.ServicoService;
@Order(8)
@Component
public class ProjetoLoader implements ApplicationRunner {
	
	@Autowired
	private ProjetoService projetoService;
	
	@Autowired
	private InfraestruturaService infraestruturaService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ServicoService servicoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/projeto.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		
		
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Infraestrutura infraestruturaDeTeste = infraestruturaService.obterItemAleatorio();
				Projeto projeto = new Projeto(informacoes[0], informacoes[1], infraestruturaDeTeste);
				projeto.setProdutos(produtoService.obterItensAleatorios());				
				projeto.setServicos(servicoService.obterItensAleatorios());				
				projetoService.incluir(projeto);
				
			}
			linha = leitura.readLine();
		}
		
  		for(Projeto projeto : projetoService.obterLista()) {
  			System.out.println("PROJETO: " + projeto);
		}

		leitura.close();
		
		
	}

}
