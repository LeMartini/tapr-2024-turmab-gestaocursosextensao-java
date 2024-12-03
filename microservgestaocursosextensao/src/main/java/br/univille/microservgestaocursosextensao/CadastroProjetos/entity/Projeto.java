package br.univille.microservgestaocursosextensao.CadastroProjetos.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "projeto", autoCreateContainer = true)
public class Projeto {

    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String nome;
    private LocalDate dataInicio;
    private String tema;
    private String status;

    public String getIdProjeto() {
        return id;
    }

    public void setIdProjeto(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
