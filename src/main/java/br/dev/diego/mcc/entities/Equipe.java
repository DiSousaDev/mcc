package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeEquipe;

    @OneToOne
    @JoinColumn(name = "casal_coordenador_id")
    private Casal casalCoordenador;

    @ManyToOne
    @JoinColumn(name = "retiro_id")
    private Retiro retiro;

    @ManyToMany
    @JoinTable(name = "tb_equipe_casal",
            joinColumns = @JoinColumn(name = "equipe_id"),
            inverseJoinColumns = @JoinColumn(name = "casal_id"))
    private final List<Casal> casais = new ArrayList<>();

    public Equipe() {
    }

    public Equipe(Long id, String nomeEquipe, Casal casalCoordenador, Retiro retiro) {
        this.id = id;
        this.nomeEquipe = nomeEquipe;
        this.casalCoordenador = casalCoordenador;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public Casal getCasalCoordenador() {
        return casalCoordenador;
    }

    public void setCasalCoordenador(Casal casalCoordenador) {
        this.casalCoordenador = casalCoordenador;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public List<Casal> getCasais() {
        return casais;
    }
}
