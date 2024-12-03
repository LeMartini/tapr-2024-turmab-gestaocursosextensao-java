package br.univille.microservgestaocursosextensao.CadastroProjetos.entity;

import java.time.LocalDate;
import java.util.UUID;

public class StatusProjeto {
    private UUID idEtapa;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String status;

    public UUID getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(UUID idEtapa) {
        this.idEtapa = idEtapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}