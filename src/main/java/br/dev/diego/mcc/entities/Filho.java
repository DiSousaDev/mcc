package br.dev.diego.mcc.entities;

import java.time.LocalDate;

public class Filho {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;

    private CasalNeo casalNeo;

    public Filho() {
    }

    public Filho(Long id, String nome, LocalDate dataNascimento, CasalNeo casalNeo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.casalNeo = casalNeo;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public CasalNeo getCasalNeo() {
        return casalNeo;
    }

    public void setCasalNeo(CasalNeo casalNeo) {
        this.casalNeo = casalNeo;
    }
}
