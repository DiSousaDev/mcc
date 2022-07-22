package br.dev.diego.mcc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CasalNeo {

    private Long id;
    private Esposo esposo;
    private Esposa esposa;
    private Responsavel responsavel;
    private LocalDate dataCasamentoCivil;
    private LocalDate dataCasamentoReligioso;
    private String observacoes;

    private CasalNeo padrinho;

    private Retiro retiro;

    private List<Equipe> equipes = new ArrayList<>();

    private List<Filho> filhos = new ArrayList<>();

    public CasalNeo() {
    }

    public CasalNeo(Long id, Esposo esposo, Esposa esposa, Responsavel responsavel, LocalDate dataCasamentoCivil,
                    LocalDate dataCasamentoReligioso, String observacoes, CasalNeo padrinho, Retiro retiro) {
        this.id = id;
        this.esposo = esposo;
        this.esposa = esposa;
        this.responsavel = responsavel;
        this.dataCasamentoCivil = dataCasamentoCivil;
        this.dataCasamentoReligioso = dataCasamentoReligioso;
        this.observacoes = observacoes;
        this.padrinho = padrinho;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Esposo getEsposo() {
        return esposo;
    }

    public void setEsposo(Esposo esposo) {
        this.esposo = esposo;
    }

    public Esposa getEsposa() {
        return esposa;
    }

    public void setEsposa(Esposa esposa) {
        this.esposa = esposa;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getDataCasamentoCivil() {
        return dataCasamentoCivil;
    }

    public void setDataCasamentoCivil(LocalDate dataCasamentoCivil) {
        this.dataCasamentoCivil = dataCasamentoCivil;
    }

    public LocalDate getDataCasamentoReligioso() {
        return dataCasamentoReligioso;
    }

    public void setDataCasamentoReligioso(LocalDate dataCasamentoReligioso) {
        this.dataCasamentoReligioso = dataCasamentoReligioso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public CasalNeo getPadrinho() {
        return padrinho;
    }

    public void setPadrinho(CasalNeo padrinho) {
        this.padrinho = padrinho;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public List<Filho> getFilhos() {
        return filhos;
    }
}
