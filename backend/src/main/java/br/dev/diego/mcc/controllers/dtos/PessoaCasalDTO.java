package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.PessoaCasal;

public class PessoaCasalDTO extends PessoaDTO {

    private Boolean inMemoriam;
    private String profissao;

    public PessoaCasalDTO() {
    }

    public PessoaCasalDTO(PessoaCasal entity) {
        super(entity.getId(), entity.getNome(), entity.getNomePreferencia(), entity.getDataNascimento(),
                entity.getEmail(), entity.getTelefone(), entity.getCelular());
        inMemoriam = entity.getInMemoriam();
        profissao = entity.getProfissao();
    }

    public Boolean getInMemoriam() {
        return inMemoriam;
    }

    public String getProfissao() {
        return profissao;
    }
}
