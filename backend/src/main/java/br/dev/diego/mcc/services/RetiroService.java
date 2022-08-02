package br.dev.diego.mcc.services;

import br.dev.diego.mcc.repositories.RetiroRepository;
import br.dev.diego.mcc.controllers.dtos.RetiroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RetiroService {

    @Autowired
    private RetiroRepository repository;
    
    @Transactional(readOnly = true)
    public List<RetiroDTO> findAll() {
        return repository.findAll().stream().map(RetiroDTO::new).collect(Collectors.toList());
    }

}
