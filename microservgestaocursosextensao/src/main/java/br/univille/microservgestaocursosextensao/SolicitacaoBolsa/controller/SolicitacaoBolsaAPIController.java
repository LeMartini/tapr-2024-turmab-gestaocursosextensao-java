package br.univille.microservgestaocursosextensao.SolicitacaoBolsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.entity.SolicitacaoBolsa;
import br.univille.microservgestaocursosextensao.SolicitacaoBolsa.service.SolicitacaoBolsaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/solicitacaoBolsa")

public class SolicitacaoBolsaAPIController {
    @Autowired
    private SolicitacaoBolsaService service;

    @GetMapping
    public ResponseEntity<List<SolicitacaoBolsa>> get(){
        var listaSolicitacaoBolsa = service.getAll();

        return new ResponseEntity<List<SolicitacaoBolsa>>(listaSolicitacaoBolsa, HttpStatus.OK);
    }

    @PostMapping("path")
    public ResponseEntity<SolicitacaoBolsa> post(@RequestBody SolicitacaoBolsa solicitacaoBolsa) {
        if(solicitacaoBolsa == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var solicitacaoBolsaSalvo = service.save(solicitacaoBolsa);

        return new ResponseEntity<SolicitacaoBolsa>(solicitacaoBolsaSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SolicitacaoBolsa> 
        put(@PathVariable("id") String id, 
            @RequestBody SolicitacaoBolsa solicitacaoBolsa){
        if(solicitacaoBolsa == null || id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        solicitacaoBolsa = service.update(id, solicitacaoBolsa);
        if (solicitacaoBolsa == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<SolicitacaoBolsa>(solicitacaoBolsa, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SolicitacaoBolsa> delete(
                    @PathVariable("id") String id){
        if(id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var solicitacaoBolsa = service.delete(id);
        if(solicitacaoBolsa == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<SolicitacaoBolsa>(solicitacaoBolsa,HttpStatus.OK);
    }

}