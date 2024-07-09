package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CondicaoPgto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricaoCondicao;
    @Column
    private int numeroParcelas;
    @Column
    private int diasPrimeiraParcela;
    @Column
    private int diasEntreParcela;
    @Column
    private String status;

    public CondicaoPgto() {
    }

    public CondicaoPgto(int id, String descricaoCondicao, int numeroParcelas, int diasPrimeiraParcela, int diasEntreParcela, String status) {
        this.id = id;
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diasEntreParcela = diasEntreParcela;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoCondicao() {
        return descricaoCondicao;
    }

    public void setDescricaoCondicao(String descricaoCondicao) {
        this.descricaoCondicao = descricaoCondicao;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getDiasPrimeiraParcela() {
        return diasPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
        this.diasPrimeiraParcela = diasPrimeiraParcela;
    }

    public int getDiasEntreParcela() {
        return diasEntreParcela;
    }

    public void setDiasEntreParcela(int diasEntreParcelas) {
        this.diasEntreParcela = diasEntreParcelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getDescricaoCondicao() + ";" + this.getNumeroParcelas() + ";"
                + this.getDiasPrimeiraParcela() + ";" + this.getDiasEntreParcela() + ";" + this.getStatus();
    }

}
