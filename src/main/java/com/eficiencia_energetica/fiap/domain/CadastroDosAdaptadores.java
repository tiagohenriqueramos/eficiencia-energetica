package com.eficiencia_energetica.fiap.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastro_adaptadores")
public class CadastroDosAdaptadores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CADASTRO_ADAPTADORES_SEQ")
    @SequenceGenerator(name = "CADASTRO_ADAPTADORES_SEQ", sequenceName = "CADASTRO_ADAPTADORES_SEQ", allocationSize = 1)
    private Long id;
    private String nome;
    private String tipoAdaptador;
    private String modelo;
    private String fabricante;
    private String versao;
    private String protocolo;
    private String ip;
    private String porta;


    public CadastroDosAdaptadores() {
    }

    public CadastroDosAdaptadores(Long id, String nome, String tipoAdaptador, String modelo, String fabricante, String versao, String protocolo, String ip, String porta) {
        this.id = id;
        this.nome = nome;
        this.tipoAdaptador = tipoAdaptador;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.versao = versao;
        this.protocolo = protocolo;
        this.ip = ip;
        this.porta = porta;

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

    public String getTipoAdaptador() {
        return tipoAdaptador;
    }

    public void setTipoAdaptador(String tipoAdaptador) {
        this.tipoAdaptador = tipoAdaptador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

}
