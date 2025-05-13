package com.eficiencia_energetica.fiap.controller;

import com.eficiencia_energetica.fiap.domain.PreferenciasDoUsuario;
import com.eficiencia_energetica.fiap.service.PreferenciasDoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preferencias")
class PreferenciasDoUsuarioController {

    @Autowired
    private PreferenciasDoUsuarioService service;

    @GetMapping
    public List<PreferenciasDoUsuario> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<PreferenciasDoUsuario> buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public PreferenciasDoUsuario salvar(@RequestBody PreferenciasDoUsuario p) {
        return service.save(p);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deleteById(id);
    }
}