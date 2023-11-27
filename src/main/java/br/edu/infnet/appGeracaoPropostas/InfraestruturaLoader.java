package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;
import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.service.InfraestruturaService;
@Order(5)
@Component
public class InfraestruturaLoader implements ApplicationRunner {
	
	@Autowired
	private InfraestruturaService infraestruturaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/infraestrutura.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		Cliente clienteDeTeste = new Cliente("Cliente de teste IL");
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Infraestrutura infraestrutura = new Infraestrutura(informacoes[0], informacoes[1], clienteDeTeste);
				infraestruturaService.incluir(infraestrutura);
			}
			linha = leitura.readLine();
		}
		
		for(Infraestrutura infraestrutura : infraestruturaService.obterLista()) {
			System.out.println("INFRAESTRUTURA: " + infraestrutura);
		}

		leitura.close();
		
		
	}

}
