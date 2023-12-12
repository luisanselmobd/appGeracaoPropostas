package br.edu.infnet.appGeracaoPropostas.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appGeracaoPropostas.model.domain.Financeiro;

@Repository
public interface FinanceiroRepository extends CrudRepository<Financeiro, Integer> {

}
