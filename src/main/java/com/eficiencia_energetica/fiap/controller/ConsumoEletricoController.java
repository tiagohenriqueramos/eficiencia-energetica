package com.eficiencia_energetica.fiap.controller;

import com.eficiencia_energetica.fiap.domain.ConsumoEletrico;
import com.eficiencia_energetica.fiap.service.ConsumoEletricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consumos")
class ConsumoEletricoController {
    @Autowired
    private ConsumoEletricoService service;

    @GetMapping
    public List<ConsumoEletrico> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ConsumoEletrico> buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ConsumoEletrico salvar(@RequestBody ConsumoEletrico c) {
        return service.save(c);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deleteById(id);
    }
}