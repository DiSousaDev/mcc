package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Pessoa;

public class PessoaResponsavelDTO extends PessoaDTO {

    private String grauParentesco;

    public PessoaResponsavelDTO() {
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

}
