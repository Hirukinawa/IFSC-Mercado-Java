package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @Column
    @Temporal(TemporalType.TIME)
    private Calendar horaCompra;
      @Column
    private String numeroNF;
      @Column
    private String tipoNF;
      @Column
    private float valorDesconto;
      @Column
    private float valorAcrescimo;
      @Column
    private float totalNF;
      @Column
    private char status;
    
    private Fornecedor fornecedor;
    private CondicaoPgto condicaoPgto;

    public Compra() {
    }

    public Compra(int id, Date dataCompra, Calendar horaCompra, String numeroNF, String tipoNF, float valorDesconto, float valorAcrescimo, float totalNF, char status, Fornecedor fornecedor, CondicaoPgto condicaoPgto) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.horaCompra = horaCompra;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.status = status;
        this.fornecedor = fornecedor;
        this.condicaoPgto = condicaoPgto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Calendar getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Calendar horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public CondicaoPgto getCondicaoPgto() {
        return condicaoPgto;
    }

    public void setCondicaoPgto(CondicaoPgto condicaoPgto) {
        this.condicaoPgto = condicaoPgto;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getDataCompra() + ";" + this.getHoraCompra() + ";" +
                this.getNumeroNF() + ";" + this.getTipoNF() + ";" + this.getValorDesconto() + ";" +
                this.getValorAcrescimo() + ";" + this.getTotalNF() + ";" + this.getStatus() + ";" +
                
                this.getFornecedor().toString() + ";" + this.getCondicaoPgto().toString();
                
    }
    
    
    
}
