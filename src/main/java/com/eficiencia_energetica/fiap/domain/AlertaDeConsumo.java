package com.eficiencia_energetica.fiap.domain;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "alerta_de_consumo")
public class AlertaDeConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALERTA_SEQ")
    @SequenceGenerator(name = "ALERTA_SEQ", sequenceName = "ALERTA_SEQ", allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "consumo_eletrico_id")
    private ConsumoEletrico consumoEletrico;
    private Date dataAlerta;

    public AlertaDeConsumo() {
    }

    public AlertaDeConsumo(Long id, ConsumoEletrico consumoEletrico, Date dataAlerta) {
        this.id = id;
        this.consumoEletrico = consumoEletrico;
        this.dataAlerta = dataAlerta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConsumoEletrico getConsumoEletrico() {
        return consumoEletrico;
    }

    public void setConsumoEletrico(ConsumoEletrico consumoEletrico) {
        this.consumoEletrico = consumoEletrico;
    }

    public Date getDataAlerta() {
        return dataAlerta;
    }

    public void setDataAlerta(Date dataAlerta) {
        this.dataAlerta = dataAlerta;
    }
}
