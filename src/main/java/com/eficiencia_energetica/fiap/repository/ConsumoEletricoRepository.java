package com.eficiencia_energetica.fiap.repository;

import com.eficiencia_energetica.fiap.domain.ConsumoEletrico;
import com.eficiencia_energetica.fiap.domain.PreferenciasDoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConsumoEletricoRepository extends JpaRepository<ConsumoEletrico, Long> {

    public Optional<ConsumoEletrico> findById(Long id);
}
