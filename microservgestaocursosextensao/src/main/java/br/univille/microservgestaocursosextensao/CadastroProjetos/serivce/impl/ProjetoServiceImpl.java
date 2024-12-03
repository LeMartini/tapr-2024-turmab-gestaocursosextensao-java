package br.univille.microservgestaocursosextensao.CadastroProjetos.serivce.impl;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.microservgestaocursosextensao.CadastroProjetos.repository.ProjetoRepository;
import br.univille.microservgestaocursosextensao.CadastroProjetos.serivce.ProjetoService;

public class ProjetoServiceImpl implements ProjetoService {
    @Autowired
    private ProjetoRepository repository;
    
    @Override
    public List<Projeto> getAll() {
        var retornoIterador = repository.findAll();
        var listaProjetos = new ArrayList<Projeto>();
        
        retornoIterador.forEach(listaProjetos::add);
        return listaProjetos;
    }

    @Override
    public Projeto save(Projeto projeto) {
        return repository.save(projeto);
    }

    @Override
    public Projeto update(String id, Projeto projeto) {
        var buscaProjeto = repository.findById(id);
        if(buscaProjeto.isPresent()){
            var projetoAntigo = buscaProjeto.get();
            //atualizo os atributos
            projetoAntigo.setNome(projeto.getNome());
            repository.save(projetoAntigo);
            return projetoAntigo;
        }
        return null;
    }

    @Override
    public Projeto delete(String id) {
        var buscaProjeto = repository.findById(id);
        if(buscaProjeto.isPresent()){
            var projetoAntigo = buscaProjeto.get();
            repository.delete(projetoAntigo);
            return projetoAntigo;
        }
        return null;
    }
    
}