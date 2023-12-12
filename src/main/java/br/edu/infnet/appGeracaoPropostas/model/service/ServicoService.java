package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.domain.Servico;
import br.edu.infnet.appGeracaoPropostas.model.repositories.ServicoRepository;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository servicoRepository;	
	
	public void incluir(Servico servico) {
		servicoRepository.save(servico);
	}
	
	public Collection<Servico> obterLista() {
		return (Collection<Servico>) servicoRepository.findAll();
	}
	
	public List<Servico> obterItensAleatorios() {
	    List<Servico> servicos = (List<Servico>) servicoRepository.findAll();

	    if (servicos.isEmpty()) {
	        return null;
	    }

	    Random random = new Random();
	    int quantidadeAleatoria = random.nextInt(servicos.size());

	    return servicos.subList(0, quantidadeAleatoria);
			    
	}
}