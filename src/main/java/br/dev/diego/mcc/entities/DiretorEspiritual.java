package br.dev.diego.mcc.entities;

public class DiretorEspiritual {

    private Long id;
    private String nome;
    private String telefone;
    private String observacoes;
    private Endereco endereco;

    public DiretorEspiritual() {
    }

    public DiretorEspiritual(Long id, String nome, String telefone, String observacoes, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.observacoes = observacoes;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
