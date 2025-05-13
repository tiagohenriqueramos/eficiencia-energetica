package com.eficiencia_energetica.fiap.controller;

import com.eficiencia_energetica.fiap.domain.AlertaDeConsumo;
import com.eficiencia_energetica.fiap.service.AlertaDeConsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertas")
class AlertaDeConsumoController {

    @Autowired
    private AlertaDeConsumoService service;

    @GetMapping
    public List<AlertaDeConsumo> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AlertaDeConsumo> buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public AlertaDeConsumo salvar(@RequestBody AlertaDeConsumo alerta) {
        return service.save(alerta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deleteById(id);
    }
}
