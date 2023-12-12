package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;
import br.edu.infnet.appGeracaoPropostas.model.service.ClienteService;
@Order(4)
@Component
public class ClienteLoader implements ApplicationRunner {
	
	@Autowired
	private ClienteService clienteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/cliente.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 1) {
				Cliente cliente = new Cliente(informacoes[0]);
				clienteService.incluir(cliente);
			}
			linha = leitura.readLine();
		}
		
		for(Cliente cliente : clienteService.obterLista()) {
			System.out.println("CLIENTE: " + cliente);
		}

		leitura.close();
		
		
	}

}
