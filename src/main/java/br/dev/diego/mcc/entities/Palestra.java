package br.dev.diego.mcc.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Palestra {

    private Long id;
    private LocalDate data;
    private String tema;

    private Retiro retiro;

    private List<Palestrante> palestrantes = new ArrayList<>();

    public Palestra() {
    }

    public Palestra(Long id, LocalDate data, String tema, Retiro retiro) {
        this.id = id;
        this.data = data;
        this.tema = tema;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public List<Palestrante> getPalestrantes() {
        return palestrantes;
    }

}
