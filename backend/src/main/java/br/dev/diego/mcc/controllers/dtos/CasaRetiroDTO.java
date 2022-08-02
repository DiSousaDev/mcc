package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.CasaRetiro;

public class CasaRetiroDTO {

    private Long id;
    private String nome;
    private EnderecoDTO endereco;

    public CasaRetiroDTO() {
    }

    public CasaRetiroDTO(CasaRetiro entity) {
        id = entity.getId();
        nome = entity.getNome();
        endereco = new EnderecoDTO(entity.getEndereco());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }
}
