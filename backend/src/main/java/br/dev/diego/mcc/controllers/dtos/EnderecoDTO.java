package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Cidade;
import br.dev.diego.mcc.entities.Endereco;

public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private CidadeDTO cidade;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Endereco entity) {
        id = entity.getId();
        logradouro = entity.getLogradouro();
        numero = entity.getNumero();
        complemento = entity.getComplemento();
        bairro = entity.getBairro();
        cidade = new CidadeDTO(entity.getCidade());
    }

    public Long getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }
}
