package com.eficiencia_energetica.fiap.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "consumo_eletrico")
public class ConsumoEletrico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONSUMO_SEQ")
    @SequenceGenerator(name = "CONSUMO_SEQ", sequenceName = "CONSUMO_SEQ", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String consumoKWH;
    private Date dataConsumo;

    public ConsumoEletrico() {
    }

    public ConsumoEletrico(Long id, Usuario usuario, String consumo, Date dataConsumo) {
        this.id = id;
        this.usuario = usuario;
        this.consumoKWH = consumo;
        this.dataConsumo = dataConsumo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getConsumoKWH() {
        return consumoKWH;
    }

    public void setConsumoKWH(String consumoKWH) {
        this.consumoKWH = consumoKWH;
    }

    public Date getDataConsumo() {
        return dataConsumo;
    }

    public void setDataConsumo(Date dataConsumo) {
        this.dataConsumo = dataConsumo;
    }
}
