package br.edu.infnet.appGeracaoPropostas.model.service;

import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeracaoPropostas.model.domain.Cliente;
import br.edu.infnet.appGeracaoPropostas.model.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;	
	
	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public Collection<Cliente> obterLista() {
		return (Collection<Cliente>) clienteRepository.findAll();
	}
	
	public Cliente obterItemAleatorio() {
	    List<Cliente> clientes = (List<Cliente>) clienteRepository.findAll();

	    if (clientes.isEmpty()) {
	        return null;
	    }

	    Random random = new Random();
	    int indiceAleatorio = random.nextInt(clientes.size());

	    return clientes.get(indiceAleatorio);
			    
	}
}
