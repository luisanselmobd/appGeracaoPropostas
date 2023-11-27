package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Comercial;
import br.edu.infnet.appGeracaoPropostas.model.service.ComercialService;
@Order(1)
@Component
public class ComercialLoader implements ApplicationRunner {
	
	@Autowired
	private ComercialService comercialService;
	

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/comercial.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Comercial comercial = new Comercial(informacoes[0], informacoes[1]);
				
				comercialService.incluir(comercial);
			}
			linha = leitura.readLine();
		}
		
		
		for(Comercial perfilComercial : comercialService.obterLista()) {
			System.out.println("COMERCIAL: " + perfilComercial);
		}

		leitura.close();
		
		
	}

}
