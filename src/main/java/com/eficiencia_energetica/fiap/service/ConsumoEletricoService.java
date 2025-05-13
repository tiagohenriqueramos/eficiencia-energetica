package com.eficiencia_energetica.fiap.service;

import com.eficiencia_energetica.fiap.domain.ConsumoEletrico;
import com.eficiencia_energetica.fiap.repository.ConsumoEletricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumoEletricoService {

    @Autowired
    private ConsumoEletricoRepository repository;

    public List<ConsumoEletrico> findAll() {
        return repository.findAll();
    }

    public Optional<ConsumoEletrico> findById(Long id) {
        return repository.findById(id);
    }

    public ConsumoEletrico save(ConsumoEletrico consumo) {
        return repository.save(consumo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}