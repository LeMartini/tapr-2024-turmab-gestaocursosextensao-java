package br.univille.microservgestaocursosextensao.SolicitacaoBolsa.service;

import java.util.List;

import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.entity.SolicitacaoBolsa;

public interface SolicitacaoBolsaService {
    List<SolicitacaoBolsa> getAll();
    SolicitacaoBolsa save(SolicitacaoBolsa solicitacaoBolsa);
    SolicitacaoBolsa update(String id, SolicitacaoBolsa solicitacaoBolsa);
    SolicitacaoBolsa delete(String id);
}