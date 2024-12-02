package br.univille.microservgestaocursosextensao.CadastroProjetos.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class RegistrosGerais {

    private UUID idProjetoRegistros;
    private LocalDateTime datUltimaAtualizacao;
    private String descricaoRegistroString;

    public UUID getIdProjetoRegistros() {
        return idProjetoRegistros;
    }

    public void setIdProjetoRegistros(UUID idProjetoRegistros) {
        this.idProjetoRegistros = idProjetoRegistros;
    }

    public LocalDateTime getDatUltimaAtualizacao() {
        return datUltimaAtualizacao;
    }

    public void setDatUltimaAtualizacao(LocalDateTime datUltimaAtualizacao) {
        this.datUltimaAtualizacao = datUltimaAtualizacao;
    }

    public String getDescricaoRegistroString() {
        return descricaoRegistroString;
    }

    public void setDescricaoRegistroString(String descricaoRegistroString) {
        this.descricaoRegistroString = descricaoRegistroString;
    }
}