package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Projeto;
import br.edu.infnet.appGeracaoPropostas.model.repositories.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;	
	
	public void incluir(Projeto projeto) {
		projetoRepository.save(projeto);
	}
	
	public Collection<Projeto> obterLista() {
		return (Collection<Projeto>) projetoRepository.findAll();
	}
}