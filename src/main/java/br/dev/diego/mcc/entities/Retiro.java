package br.dev.diego.mcc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Retiro {

    private Long id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String tema;
    private String lema;

    private List<Palestra> palestras = new ArrayList<>();

    private List<CasalNeo> casaisNeo = new ArrayList<>();

    private List<Equipe> equipes = new ArrayList<>();

    public Retiro(Long id, String nome, LocalDate dataInicio, LocalDate dataFim, String tema, String lema) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tema = tema;
        this.lema = lema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public List<CasalNeo> getCasaisNeo() {
        return casaisNeo;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
}
