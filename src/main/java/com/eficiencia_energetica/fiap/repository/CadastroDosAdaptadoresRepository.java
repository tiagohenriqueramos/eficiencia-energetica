package com.eficiencia_energetica.fiap.repository;

import com.eficiencia_energetica.fiap.domain.CadastroDosAdaptadores;
import com.eficiencia_energetica.fiap.domain.ConsumoEletrico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CadastroDosAdaptadoresRepository extends JpaRepository<CadastroDosAdaptadores, Long> {

    public Optional<CadastroDosAdaptadores> findById(Long id);
}
