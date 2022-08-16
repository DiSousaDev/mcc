package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Retiro;

import java.util.List;
import java.util.stream.Collectors;

public class RetiroFullDTO {

    private Long id;
    private String nome;
    private String data;
     private String casalCoordenador;
     private String casaRetiro;
     private String casaRetiroEndereco;
    private String tempoPassado;

    private List<EquipeDTO> equipes;

    private List<CasalDTO> casaisNeo;

    public RetiroFullDTO() {
    }

    public RetiroFullDTO(Retiro entity) {
        id = entity.getId();
        nome = entity.getNome();
        data = entity.getDataFormatada();
        casalCoordenador = entity.getCasalCoordenadorFormatado();
        casaRetiro = entity.getCasaRetiro().getNome();
        casaRetiroEndereco = entity.getEnderecoFormatado();
        tempoPassado = entity.getDaysAgo();
        equipes = entity.getEquipes().stream().map(EquipeDTO::new).collect(Collectors.toList());
        casaisNeo = entity.getCasaisNeo().stream().map(CasalDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getCasalCoordenador() {
        return casalCoordenador;
    }

    public String getCasaRetiro() {
        return casaRetiro;
    }

    public String getCasaRetiroEndereco() {
        return casaRetiroEndereco;
    }

    public String getTempoPassado() {
        return tempoPassado;
    }

    public List<EquipeDTO> getEquipes() {
        return equipes;
    }

    public List<CasalDTO> getCasaisNeo() {
        return casaisNeo;
    }
}
