package br.univille.microservgestaocursosextensao.SolicitacaoBolsa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.entity.SolicitacaoBolsa;
import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.repository.SolicitacaoBolsaRepository;
import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.service.SolicitacaoBolsaService;

public class SolicitacaoBolsaServiceImpl implements SolicitacaoBolsaService {
    @Autowired
    private SolicitacaoBolsaRepository repository;
    
    @Override
    public List<SolicitacaoBolsa> getAll() {
        var retornoIterador = repository.findAll();
        var listaSolicitacaoBolsas = new ArrayList<SolicitacaoBolsa>();
        
        retornoIterador.forEach(listaSolicitacaoBolsas::add);
        return listaSolicitacaoBolsas;
    }

    @Override
    public SolicitacaoBolsa save(SolicitacaoBolsa solicitacaoBolsa) {
        return repository.save(solicitacaoBolsa);
    }

    @Override
    public SolicitacaoBolsa update(String id, SolicitacaoBolsa solicitacaoBolsa) {
        var buscaSolicitacaoBolsa = repository.findById(id);
        if(buscaSolicitacaoBolsa.isPresent()){
            var solicitacaoBolsaAntigo = buscaSolicitacaoBolsa.get();
            //atualizo os atributos
            solicitacaoBolsaAntigo.setIdProjeto(solicitacaoBolsa.getIdProjeto());
            repository.save(solicitacaoBolsaAntigo);
            return solicitacaoBolsaAntigo;
        }
        return null;
    }

    @Override
    public SolicitacaoBolsa delete(String id) {
        var buscaSolicitacaoBolsa = repository.findById(id);
        if(buscaSolicitacaoBolsa.isPresent()){
            var solicitacaoBolsaAntigo = buscaSolicitacaoBolsa.get();
            repository.delete(solicitacaoBolsaAntigo);
            return solicitacaoBolsaAntigo;
        }
        return null;
    }
    
}