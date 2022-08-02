package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa_casal")
public class PessoaCasal extends Pessoa {

    private Boolean inMemoriam;
    private String profissao;

    public PessoaCasal() {
    }

    public Boolean getInMemoriam() {
        return inMemoriam;
    }

    public void setInMemoriam(Boolean inMemoriam) {
        this.inMemoriam = inMemoriam;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "PessoaCasal{" +
                "inMemoriam=" + inMemoriam +
                ", profissao='" + profissao + '\'' +
                "} " + super.toString();
    }
}
