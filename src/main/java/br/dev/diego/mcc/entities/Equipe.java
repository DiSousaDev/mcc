package br.dev.diego.mcc.entities;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private Long id;
    private String nomeEquipe;
    private CasalNeo coordenador;

    private Retiro retiro;

    private List<CasalNeo> casaisNeo = new ArrayList<>();

    public Equipe() {
    }

    public Equipe(Long id, String nomeEquipe, CasalNeo coordenador, Retiro retiro) {
        this.id = id;
        this.nomeEquipe = nomeEquipe;
        this.coordenador = coordenador;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public CasalNeo getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(CasalNeo coordenador) {
        this.coordenador = coordenador;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public List<CasalNeo> getCasaisNeo() {
        return casaisNeo;
    }
}
