package br.edu.infnet.appGeracaoPropostas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;
import br.edu.infnet.appGeracaoPropostas.model.domain.Endereco;
import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.service.ClienteService;
import br.edu.infnet.appGeracaoPropostas.model.service.EnderecoService;
import br.edu.infnet.appGeracaoPropostas.model.service.InfraestruturaService;
@Order(5)
@Component
public class InfraestruturaLoader implements ApplicationRunner {
	
	@Autowired
	private InfraestruturaService infraestruturaService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/infraestrutura.txt");
		BufferedReader leitura = new BufferedReader(file);
		String linha = leitura.readLine();
		String[] informacoes = null;
		
		while(linha != null) {
			informacoes = linha.split(";");
			if(informacoes.length == 2) {
				Cliente clienteDeTeste = clienteService.obterItemAleatorio();
				Endereco endereco = enderecoService.buscarCep(informacoes[1]);
				Infraestrutura infraestrutura = new Infraestrutura(informacoes[0], endereco, clienteDeTeste);
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