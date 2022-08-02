package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.CasaRetiro;
import br.dev.diego.mcc.entities.Casal;
import br.dev.diego.mcc.entities.Equipe;
import br.dev.diego.mcc.entities.Filho;
import br.dev.diego.mcc.entities.PessoaCasal;
import br.dev.diego.mcc.entities.PessoaResponsavel;
import br.dev.diego.mcc.entities.Retiro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CasalRetiroDTO {

    private Long id;
    private LocalDate dataCasamentoCivil;
    private LocalDate dataCasamentoReligioso;
    private String observacoes;
    private PessoaCasalDTO esposo;
    private PessoaCasalDTO esposa;

    public CasalRetiroDTO() {
    }

    public CasalRetiroDTO(Casal entity) {
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
