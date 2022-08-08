package br.dev.diego.mcc.controllers.dtos;

import br.dev.diego.mcc.entities.Retiro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class RetiroDTO {

    private Long id;
    private String nome;
    private String data;
     private String casalCoordenador;
     private String casaRetiro;
     private String casaRetiroEndereco;
    private String tempoPassado;

    public RetiroDTO() {
    }

    public RetiroDTO(Retiro entity) {
        id = entity.getId();
        nome = entity.getNome();
        data = entity.getDataFormatada();
        casalCoordenador = entity.getCasalCoordenadorFormatado();
        casaRetiro = new CasaRetiroDTO(entity.getCasaRetiro()).getNome();
        casaRetiroEndereco = entity.getEnderecoFormatado();
        tempoPassado = entity.getDaysAgo();
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

}
