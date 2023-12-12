package br.edu.infnet.appGeracaoPropostas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appGeracaoPropostas.model.domain.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto, Integer> {

}
