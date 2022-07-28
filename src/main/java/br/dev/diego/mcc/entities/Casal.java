package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_casal")
public class Casal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataCasamentoCivil;
    private LocalDate dataCasamentoReligioso;
    private String observacoes;

    @OneToOne
    @JoinColumn(name = "esposo_id")
    private PessoaCasal esposo;

    @OneToOne
    @JoinColumn(name = "esposa_id")
    private PessoaCasal esposa;

    @OneToOne
    @JoinColumn(name = "responsavel_id")
    private PessoaResponsavel responsavel;

    @ManyToOne
    @JoinColumn(name = "padrinho_id")
    private Casal padrinho;

    @ManyToOne
    @JoinColumn(name = "retiro_id")
    private Retiro retiro;

    @ManyToMany(mappedBy = "casais")
    private List<Equipe> equipes = new ArrayList<>();

    @OneToMany(mappedBy = "casal")
    private List<Filho> filhos = new ArrayList<>();

    public Casal() {
    }

    public Casal(Long id, LocalDate dataCasamentoCivil, LocalDate dataCasamentoReligioso, String observacoes,
                 PessoaCasal esposo, PessoaCasal esposa, PessoaResponsavel responsavel, Casal padrinho, Retiro retiro) {
        this.id = id;
        this.dataCasamentoCivil = dataCasamentoCivil;
        this.dataCasamentoReligioso = dataCasamentoReligioso;
        this.observacoes = observacoes;
        this.esposo = esposo;
        this.esposa = esposa;
        this.responsavel = responsavel;
        this.padrinho = padrinho;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataCasamentoCivil() {
        return dataCasamentoCivil;
    }

    public void setDataCasamentoCivil(LocalDate dataCasamentoCivil) {
        this.dataCasamentoCivil = dataCasamentoCivil;
    }

    public LocalDate getDataCasamentoReligioso() {
        return dataCasamentoReligioso;
    }

    public void setDataCasamentoReligioso(LocalDate dataCasamentoReligioso) {
        this.dataCasamentoReligioso = dataCasamentoReligioso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public PessoaCasal getEsposo() {
        return esposo;
    }

    public void setEsposo(PessoaCasal esposo) {
        this.esposo = esposo;
    }

    public PessoaCasal getEsposa() {
        return esposa;
    }

    public void setEsposa(PessoaCasal esposa) {
        this.esposa = esposa;
    }

    public PessoaResponsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaResponsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Casal getPadrinho() {
        return padrinho;
    }

    public void setPadrinho(Casal padrinho) {
        this.padrinho = padrinho;
    }


    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public List<Filho> getFilhos() {
        return filhos;
    }
}
