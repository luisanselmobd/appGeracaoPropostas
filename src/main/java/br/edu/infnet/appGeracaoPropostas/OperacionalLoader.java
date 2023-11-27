package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Operacional;
import br.edu.infnet.appGeracaoPropostas.model.service.OperacionalService;
@Order(3)
@Component
public class OperacionalLoader implements ApplicationRunner {
	
	@Autowired
	private OperacionalService operacionalService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/operacional.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Operacional operacional = new Operacional(informacoes[0], informacoes[1]);
				operacionalService.incluir(operacional);
			}
			linha = leitura.readLine();
		}
		
		for(Operacional perfilOperacional : operacionalService.obterLista()) {
			System.out.println("OPERACIONAL: " + perfilOperacional);
		}

		leitura.close();
		
		
	}

}
