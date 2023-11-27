package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Servico;
import br.edu.infnet.appGeracaoPropostas.model.service.ServicoService;
@Order(7)
@Component
public class ServicoLoader implements ApplicationRunner {
	
	@Autowired
	private ServicoService servicoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/servico.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Servico servico = new Servico(informacoes[0], informacoes[1]);
				servicoService.incluir(servico);
			}
			linha = leitura.readLine();
		}
		
		for(Servico servico : servicoService.obterLista()) {
			System.out.println("SERVIÇO: " + servico);
		}

		leitura.close();
		
		
	}

}
