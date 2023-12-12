package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Operacional;
import br.edu.infnet.appGeracaoPropostas.model.repositories.OperacionalRepository;

@Service
public class OperacionalService {
	@Autowired
	private OperacionalRepository operacionalRepository;
	
	public void incluir(Operacional operacional) {
		operacionalRepository.save(operacional);
	}
	
	public Collection<Operacional> obterLista() {
		return (Collection<Operacional>) operacionalRepository.findAll();
	}
}
