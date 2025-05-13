package com.eficiencia_energetica.fiap.repository;

import com.eficiencia_energetica.fiap.domain.PreferenciasDoUsuario;
import com.eficiencia_energetica.fiap.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PreferenciasDoUsuarioRepository extends JpaRepository<PreferenciasDoUsuario, Long> {

    public Optional<PreferenciasDoUsuario> findById(Long id);
}
