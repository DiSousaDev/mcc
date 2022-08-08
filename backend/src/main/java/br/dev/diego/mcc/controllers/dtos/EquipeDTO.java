package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Equipe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EquipeDTO {

    private Long id;
    private String nomeEquipe;
    private CasalDTO casalCoordenador;
    private List<CasalDTO> casais = new ArrayList<>();

    public EquipeDTO() {
    }

    public EquipeDTO(Equipe entity) {
        id = entity.getId();
        nomeEquipe = entity.getNomeEquipe();
        casalCoordenador = new CasalDTO(entity.getCasalCoordenador());
        casais = entity.getCasais().stream().map(CasalDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public CasalDTO getCasalCoordenador() {
        return casalCoordenador;
    }

    public List<CasalDTO> getCasais() {
        return casais;
    }
}
