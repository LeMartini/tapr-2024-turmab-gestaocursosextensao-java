package br.univille.microservgestaocursosextensao.CadastroProjetos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaocursosextensao.CadastroProjetos.entity.Projeto;
import br.univille.microservgestaocursosextensao.CadastroProjetos.serivce.ProjetoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/projeto")
public class ProjetoAPIController {

    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<Projeto>> get(){
        var listaProjetos = service.getAll();

        return new ResponseEntity<List<Projeto>>(listaProjetos, HttpStatus.OK);
    }

    @PostMapping("path")
    public ResponseEntity<Projeto> post(@RequestBody Projeto projeto) {
        if(projeto == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var projetoSalvo = service.save(projeto);

        return new ResponseEntity<Projeto>(projetoSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Projeto> 
        put(@PathVariable("id") String id, 
            @RequestBody Projeto projeto){
        if(projeto == null || id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        projeto = service.update(id, projeto);
        if (projeto == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Projeto>(projeto, HttpStatus.OK);
    }
    
}