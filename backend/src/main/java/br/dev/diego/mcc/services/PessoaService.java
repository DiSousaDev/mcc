package br.dev.diego.mcc.services;

import br.dev.diego.mcc.entities.Pessoa;
import br.dev.diego.mcc.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;
    
    @Transactional(readOnly = true)
    public Pessoa getPessoa(Long id) {
        return repository.findById(id).orElseThrow();
    }

}
