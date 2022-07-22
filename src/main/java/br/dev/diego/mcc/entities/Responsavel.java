package br.dev.diego.mcc.entities;

import java.time.LocalDate;

public class Responsavel extends Pessoa {

    private String grauParentesco;

    public Responsavel() {
    }

    public Responsavel(Long id, String nome, LocalDate dataNascimento, String email, String telefone, String celular,
                       String grauParentesco) {
        super(id, nome, dataNascimento, email, telefone, celular);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
}
