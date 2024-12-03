package br.univille.microservgestaocursosextensao.CadastroProjetos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;

@Repository
public interface ProjetoRepository extends CrudRepository<Projeto,String>{
    
}
