package br.edu.infnet.appGeracaoPropostas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appGeracaoPropostas.model.domain.Operacional;

@Repository
public interface OperacionalRepository extends CrudRepository<Operacional, Integer> {

}
