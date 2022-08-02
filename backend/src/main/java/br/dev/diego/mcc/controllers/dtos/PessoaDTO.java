package br.dev.diego.mcc.controllers.dtos;

import java.time.LocalDate;
import java.util.Arrays;

public class PessoaDTO {

    private Long id;
    private String nome;
    private String nomePreferencia;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String celular;

    public PessoaDTO() {
    }

    public PessoaDTO(Long id, String nome, String nomePreferencia, LocalDate dataNascimento, String email,
                     String telefone, String celular) {
        this.id = id;
        this.nome = nome;
        this.nomePreferencia = getNomePreferencia(nomePreferencia);
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomePreferencia() {
        return nomePreferencia;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    private String getNomePreferencia(String nomePreferencia) {
        String novoNome = null;
        if(nome != null) {
            String[] value = nome.split(" ");
            novoNome = value[0];
        }
        return nomePreferencia != null ? nomePreferencia : novoNome;
    }
}
