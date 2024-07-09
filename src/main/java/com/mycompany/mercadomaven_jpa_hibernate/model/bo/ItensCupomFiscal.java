package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItensCupomFiscal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column
    private float qtdProduto;
    @Column
    private float valorUnitarioProduto;
    @Column
    private char status;
    @JoinColumn
    @ManyToOne
    private CupomFiscal cupomFiscal;
    @JoinColumn
    @ManyToOne
    private Produto produto;

    public ItensCupomFiscal() {
    }

    public ItensCupomFiscal(UUID id, float qtdProduto, float valorUnitarioProduto, char status, CupomFiscal cupomFiscal, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
    }

    public ItensCupomFiscal(float qtdProduto, float valorUnitarioProduto, char status, CupomFiscal cupomFiscal, Produto produto) {
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.produto = produto;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getQtdProduto() + ";" + this.getValorUnitarioProduto() + ";" +
                this.getStatus() + ";" +
                
                this.getCupomFiscal().toString() + ";" + this.getProduto().toString();
    }
    
    
    
    
    
    
}
