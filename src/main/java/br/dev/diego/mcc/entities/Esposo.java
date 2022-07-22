package br.dev.diego.mcc.entities;

import java.time.LocalDate;

public class Esposo extends Pessoa {

    private Boolean inMemoriam;
    private String Profissao;

    public Esposo() {
    }

    public Esposo(Long id, String nome, LocalDate dataNascimento, String email, String telefone, String celular,
                  Boolean inMemoriam, String profissao) {
        super(id, nome, dataNascimento, email, telefone, celular);
        this.inMemoriam = inMemoriam;
        Profissao = profissao;
    }

    public Boolean getInMemoriam() {
        return inMemoriam;
    }

    public void setInMemoriam(Boolean inMemoriam) {
        this.inMemoriam = inMemoriam;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String profissao) {
        Profissao = profissao;
    }
}
