package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa_responsavel")
public class PessoaResponsavel extends Pessoa {

    private String grauParentesco;

    public PessoaResponsavel() {
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

}
