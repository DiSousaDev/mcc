package br.dev.diego.mcc.entities;

public class CasaRetiro {

    private Long id;
    private String nome;
    private Endereco endereco;

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
