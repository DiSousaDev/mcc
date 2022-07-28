package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_pessoa_responsavel")
public class PessoaResponsavel extends Pessoa {

    private String grauParentesco;

    public PessoaResponsavel() {
    }

    public PessoaResponsavel(Long id, String nome, LocalDate dataNascimento, String email, String telefone, String celular,
                             Endereco endereco, String grauParentesco) {
        super(id, nome, dataNascimento, email, telefone, celular, endereco);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

}
