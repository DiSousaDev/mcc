package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Cidade;

public class CidadeDTO {

    private Long id;
    private String nome;
    private String estado;
    private String sigla;

    public CidadeDTO() {
    }

    public CidadeDTO(Cidade entity) {
        id = entity.getId();
        nome = entity.getNome();
        estado = entity.getEstado().getNome();
        sigla = entity.getEstado().getSigla();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getSigla() {
        return sigla;
    }
}
