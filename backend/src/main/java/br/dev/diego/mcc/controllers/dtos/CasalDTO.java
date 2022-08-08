package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Casal;

import java.time.LocalDate;

public class CasalDTO {

    private Long id;
    private LocalDate dataCasamentoCivil;
    private LocalDate dataCasamentoReligioso;
    private String observacoes;
    private PessoaCasalDTO esposo;
    private PessoaCasalDTO esposa;

    public CasalDTO() {
    }

    public CasalDTO(Casal entity) {
        id = entity.getId();
        dataCasamentoCivil = entity.getDataCasamentoCivil();
        dataCasamentoReligioso = entity.getDataCasamentoReligioso();
        observacoes = entity.getObservacoes();
        esposo = new PessoaCasalDTO(entity.getEsposo());
        esposa = new PessoaCasalDTO(entity.getEsposa());
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataCasamentoCivil() {
        return dataCasamentoCivil;
    }

    public LocalDate getDataCasamentoReligioso() {
        return dataCasamentoReligioso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public PessoaCasalDTO getEsposo() {
        return esposo;
    }

    public PessoaCasalDTO getEsposa() {
        return esposa;
    }
}
