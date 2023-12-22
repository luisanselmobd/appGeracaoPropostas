package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Comercial;
import br.edu.infnet.appGeracaoPropostas.model.repositories.ComercialRepository;

@Service
public class ComercialService {

	@Autowired
	private ComercialRepository comercialRepository;	
	
	public void incluir(Comercial comercial) {
		comercialRepository.save(comercial);
	}
	
	public Collection<Comercial> obterLista() {
		return (Collection<Comercial>) comercialRepository.findAll();
	}
	
	public void excluir(int id) {
		comercialRepository.deleteById(id);
	}
}
