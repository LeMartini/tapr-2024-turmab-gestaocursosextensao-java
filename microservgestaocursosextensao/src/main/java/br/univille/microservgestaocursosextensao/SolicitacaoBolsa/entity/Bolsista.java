package br.univille.microservgestaocursosextensao.SolicitacaoBolsa.entity;

public class Bolsista {

    private String idBolsista;
    private String idSolicitacao;
    private String nome;
    private String matricula;
    private String cursos;
    private String statusMatricula;

    public String getIdBolsista() {
        return idBolsista;
    }

    public void setIdBolsista(String idBolsista) {
        this.idBolsista = idBolsista;
    }

    public String getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(String idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
}
