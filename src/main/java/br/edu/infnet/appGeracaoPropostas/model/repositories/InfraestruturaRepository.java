package br.edu.infnet.appGeracaoPropostas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appGeracaoPropostas.model.domain.Infraestrutura;

@Repository
public interface InfraestruturaRepository extends CrudRepository<Infraestrutura, Integer> {

}
