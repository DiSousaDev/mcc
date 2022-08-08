package br.dev.diego.mcc.entities;

import br.dev.diego.mcc.controllers.dtos.CasaRetiroDTO;
import br.dev.diego.mcc.controllers.dtos.CasalDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "tb_retiro")
public class Retiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String tema;
    private String lema;

    @OneToOne
    @JoinColumn(name = "casal_coordenador_id")
    private Casal casalCoordenador;

    @OneToOne
    @JoinColumn(name = "casa_retiro_id")
    private CasaRetiro casaRetiro;

    @OneToMany(mappedBy = "retiro")
    private final List<Palestra> palestras = new ArrayList<>();

    @OneToMany(mappedBy = "retiro")
    private final List<Casal> casaisNeo = new ArrayList<>();

    @OneToMany(mappedBy = "retiro")
    private final List<Equipe> equipes = new ArrayList<>();

    public Retiro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public Casal getCasalCoordenador() {
        return casalCoordenador;
    }

    public void setCasalCoordenador(Casal casalCoordenador) {
        this.casalCoordenador = casalCoordenador;
    }

    public CasaRetiro getCasaRetiro() {
        return casaRetiro;
    }

    public void setCasaRetiro(CasaRetiro casaRetiro) {
        this.casaRetiro = casaRetiro;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public List<Casal> getCasaisNeo() {
        return casaisNeo;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public String getCasalCoordenadorFormatado() {
        return setCasalCoordenadorFormatado(new CasalDTO(this.casalCoordenador));
    }

    public String getDataFormatada() {
        return setDataFormatada(this.dataInicio);
    }

    public String getEnderecoFormatado() {
        return setEnderecoFormatado(new CasaRetiroDTO(this.casaRetiro));
    }

    public String getDaysAgo() {
        return setDaysAgo(this.dataFim);
    }

    private String setCasalCoordenadorFormatado(CasalDTO casal) {
        return casal.getEsposo().getNomePreferencia() + " e " + casal.getEsposa().getNomePreferencia();
    }

    private String setDataFormatada(LocalDate dataInicio) {
        int dia = dataInicio.getDayOfMonth();
        String mes = dataInicio.getMonth()
                .getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        int ano = dataInicio.getYear();
        return String.format("%s, %s, %s de %s de %s", dia, dia+1, dia+2, mes, ano);
    }

    private String setEnderecoFormatado(CasaRetiroDTO casaRetiroDTO) {
        return casaRetiroDTO.getEndereco().getLogradouro() + ", " +
                casaRetiroDTO.getEndereco().getNumero();
    }

    private String setDaysAgo(LocalDate dataFim) {
        Period period = Period.between(dataFim, LocalDate.now());
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
