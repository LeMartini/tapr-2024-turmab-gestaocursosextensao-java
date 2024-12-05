package br.univille.microservgestaocursosextensao.SolicitacaoBolsa.repository;

import org.springframework.data.repository.CrudRepository;

import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.entity.SolicitacaoBolsa;

public interface SolicitacaoBolsaRepository extends CrudRepository<SolicitacaoBolsa, String> {
    
}