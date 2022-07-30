package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
}
