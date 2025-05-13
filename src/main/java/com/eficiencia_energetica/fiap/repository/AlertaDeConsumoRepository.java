package com.eficiencia_energetica.fiap.repository;

import com.eficiencia_energetica.fiap.domain.AlertaDeConsumo;
import com.eficiencia_energetica.fiap.domain.CadastroDosAdaptadores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlertaDeConsumoRepository extends JpaRepository<AlertaDeConsumo, Long> {

}
