package br.dev.diego.mcc.services;

import br.dev.diego.mcc.controllers.dtos.RetiroDTO;
import br.dev.diego.mcc.controllers.dtos.RetiroFullDTO;
import br.dev.diego.mcc.entities.Retiro;
import br.dev.diego.mcc.repositories.RetiroRepository;
import br.dev.diego.mcc.services.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        return repository.findAll(Sort.by(Sort.Direction.DESC, "dataFim"))
                .stream().map(RetiroDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public RetiroFullDTO findById(Long id) {
        return new RetiroFullDTO(repository.findById(id).orElseThrow(() ->
                new DataNotFoundException("Retiro não encontrado id: "
                        + id + " entity: " + Retiro.class.getName())));
    }
}
