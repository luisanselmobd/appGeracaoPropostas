package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;
import br.edu.infnet.appGeracaoPropostas.model.repositories.InfraestruturaRepository;

@Service
public class InfraestruturaService {

	@Autowired
	private InfraestruturaRepository infraestruturaRepository;	
	
	public void incluir(Infraestrutura infraestrutura) {
		infraestruturaRepository.save(infraestrutura);
	}
	
	public Collection<Infraestrutura> obterLista() {
		return (Collection<Infraestrutura>) infraestruturaRepository.findAll();
	}
	
	public Infraestrutura obterItemAleatorio() {
    List<Infraestrutura> infraestruturas = (List<Infraestrutura>) infraestruturaRepository.findAll();

    if (infraestruturas.isEmpty()) {
        return null;
    }

    Random random = new Random();
    int indiceAleatorio = random.nextInt(infraestruturas.size());

    return infraestruturas.get(indiceAleatorio);
		    
	}
}






