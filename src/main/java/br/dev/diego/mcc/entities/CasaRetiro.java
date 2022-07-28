package br.dev.diego.mcc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_casa_retiro")
public class CasaRetiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "retiro_id")
    private Retiro retiro;

    public CasaRetiro() {
    }

    public CasaRetiro(Long id, String nome, Endereco endereco, Retiro retiro) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.retiro = retiro;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Retiro getRetiro() {
        return retiro;
    }
}
