package com.eficiencia_energetica.fiap.controller;

import com.eficiencia_energetica.fiap.domain.CadastroDosAdaptadores;
import com.eficiencia_energetica.fiap.service.CadastroDosAdaptadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adaptadores")
class CadastroDosAdaptadoresController {
    @Autowired
    private CadastroDosAdaptadoresService service;

    @GetMapping
    public List<CadastroDosAdaptadores> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CadastroDosAdaptadores> buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public CadastroDosAdaptadores salvar(@RequestBody CadastroDosAdaptadores a) {
        return service.save(a);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deleteById(id);
    }
}
