package com.eficiencia_energetica.fiap.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "preferencia_usuario")
public class PreferenciasDoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PREFERENCIAS_SEQ")
    @SequenceGenerator(name = "PREFERENCIAS_SEQ", sequenceName = "PREFERENCIAS_SEQ", allocationSize = 1)
    private Long id;
    private String nome;
    private String ambiente;
    private String maximo;
    private String minimo;
    private Date inicio;
    private Date fim;

    public PreferenciasDoUsuario() {
    }

    public PreferenciasDoUsuario(Long id, String nome, String ambiente, String maximo, String minimo, Date inicio, Date fim) {
        this.id = id;
        this.nome = nome;
        this.ambiente = ambiente;
        this.maximo = maximo;
        this.minimo = minimo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}




























































