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
        data = getDataFormatada(entity.getDataInicio());
        casalCoordenador = getCasalCoordenadorFormatado(new CasalRetiroDTO(entity.getCasalCoordenador()));
        casaRetiro = new CasaRetiroDTO(entity.getCasaRetiro()).getNome();
        casaRetiroEndereco = getEnderecoFormatado(new CasaRetiroDTO(entity.getCasaRetiro()));
        tempoPassado = getDaysAgo(entity.getDataFim());
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

    private String getCasalCoordenadorFormatado(CasalRetiroDTO casalRetiroDTO) {
        return casalRetiroDTO.getEsposo().getNomePreferencia() + " e " + casalRetiroDTO.getEsposa().getNomePreferencia();
    }

    private String getDataFormatada(LocalDate dataInicio) {
        int dia = dataInicio.getDayOfMonth();
        String mes = dataInicio.getMonth()
                .getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        int ano = dataInicio.getYear();
        return String.format("%s, %s, %s de %s de %s", dia, dia+1, dia+2, mes, ano);
    }

    private String getEnderecoFormatado(CasaRetiroDTO casaRetiroDTO) {
        return casaRetiroDTO.getEndereco().getLogradouro() + ", " +
        casaRetiroDTO.getEndereco().getNumero();
    }

    private String getDaysAgo(LocalDate data) {
        Period period = Period.between(data, LocalDate.now());
        String msgAno = "";
        String msgMes = "";
        String msgDia = "";
        int ano = period.getYears();
        int mes = period.getMonths();
        int dia = period.getDays();

        if (ano > 0) {
            msgAno = ano + " ano";
            if (ano > 1) {
                msgAno = ano + " anos";
            }
        }

        if (mes > 0) {
            msgMes = ", " + mes + " mês e ";
            if (mes > 1) {
                msgMes = ", " + mes + " meses e ";
            }
        }

        if (dia >= 0) {
            msgDia = dia + " dia.";
            if (dia > 1) {
                msgDia = dia + " dias.";
            }
        }
        return "Há " + msgAno + msgMes + msgDia;
    }

}
