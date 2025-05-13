package com.eficiencia_energetica.fiap.service;

import com.eficiencia_energetica.fiap.domain.CadastroDosAdaptadores;
import com.eficiencia_energetica.fiap.repository.CadastroDosAdaptadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroDosAdaptadoresService {

    @Autowired
    private CadastroDosAdaptadoresRepository repository;

    public List<CadastroDosAdaptadores> findAll() {
        return repository.findAll();
    }

    public Optional<CadastroDosAdaptadores> findById(Long id) {
        return repository.findById(id);
    }

    public CadastroDosAdaptadores save(CadastroDosAdaptadores adaptador) {
        return repository.save(adaptador);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}