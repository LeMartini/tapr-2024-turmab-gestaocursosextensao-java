package br.univille.microservgestaocursosextensao.CadastroProjetos.Service;

import java.util.List;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;

public interface ProjetoService {
    List<Projeto> getAll();
    Projeto save(Projeto projeto);
    Projeto update(String id, Projeto projeto);
    Projeto delete(String id);
}
