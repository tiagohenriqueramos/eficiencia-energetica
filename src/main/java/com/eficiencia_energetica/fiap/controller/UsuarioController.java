package com.eficiencia_energetica.fiap.controller;

import com.eficiencia_energetica.fiap.domain.Usuario;
import com.eficiencia_energetica.fiap.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> buscar(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario u) {
        return service.save(u);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deleteById(id);
    }
}