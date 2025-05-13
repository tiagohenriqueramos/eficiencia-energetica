package com.eficiencia_energetica.fiap.service;

import com.eficiencia_energetica.fiap.domain.AlertaDeConsumo;
import com.eficiencia_energetica.fiap.repository.AlertaDeConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaDeConsumoService {

    @Autowired
    private AlertaDeConsumoRepository repository;

    public List<AlertaDeConsumo> findAll() {
        return repository.findAll();
    }

    public Optional<AlertaDeConsumo> findById(Long id) {
        return repository.findById(id);
    }

    public AlertaDeConsumo save(AlertaDeConsumo alerta) {
        return repository.save(alerta);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}