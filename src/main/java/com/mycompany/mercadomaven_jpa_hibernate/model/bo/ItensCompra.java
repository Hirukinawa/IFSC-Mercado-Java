package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ItensCompra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private float qtdProduto;
    @Column
    private float valorUnitarioProduto;
    @Column
    private char status;
    @JoinColumn
    @ManyToOne
    private Produto produto;
    @JoinColumn
    @ManyToOne
    private Compra compra;

    public ItensCompra() {
    }

    public ItensCompra(int id, float qtdProduto, float valorUnitarioProduto, char status, Produto produto, Compra compra) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getQtdProduto() + ";" + this.getValorUnitarioProduto() + ";" + this.getStatus() + ";" +
                
                this.getCompra().toString()  + ";" + this.getProduto().toString();
    }
    
    
    
}
