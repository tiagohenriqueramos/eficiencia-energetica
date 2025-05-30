package com.eficiencia_energetica.fiap.repository;

import com.eficiencia_energetica.fiap.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findByNome(String nome);
}
