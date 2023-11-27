package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Financeiro;
import br.edu.infnet.appGeracaoPropostas.model.service.FinanceiroService;
@Order(2)
@Component
public class FinanceiroLoader implements ApplicationRunner {
	
	@Autowired
	private FinanceiroService financeiroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/financeiro.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Financeiro financeiro = new Financeiro(informacoes[0], informacoes[1]);
				financeiroService.incluir(financeiro);
			}
			linha = leitura.readLine();
		}
		
		for(Financeiro perfilFinanceiro : financeiroService.obterLista()) {
			System.out.println("FINANCEIRO: " + perfilFinanceiro);
		}

		leitura.close();
		
		
	}

}
