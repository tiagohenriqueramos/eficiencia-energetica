package com.eficiencia_energetica.fiap.service;


import com.eficiencia_energetica.fiap.domain.PreferenciasDoUsuario;
import com.eficiencia_energetica.fiap.repository.PreferenciasDoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreferenciasDoUsuarioService {

    @Autowired
    private PreferenciasDoUsuarioRepository repository;

    public List<PreferenciasDoUsuario> findAll() {
        return repository.findAll();
    }

    public Optional<PreferenciasDoUsuario> findById(Long id) {
        return repository.findById(id);
    }

    public PreferenciasDoUsuario save(PreferenciasDoUsuario preferencia) {
        return repository.save(preferencia);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}