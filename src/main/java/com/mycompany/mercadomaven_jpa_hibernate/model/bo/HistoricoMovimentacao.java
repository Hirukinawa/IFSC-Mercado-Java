package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class HistoricoMovimentacao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
     @Column
    @Temporal(TemporalType.DATE)
    private Date data;
     @Column
    @Temporal(TemporalType.TIME)
    private Calendar hora;
     @Column
    private char tipo;
     @Column
    private float qtd;
     @Column
    private char status;
    
     @JoinColumn
     @ManyToOne
    private Produto produto;
     @JoinColumn
     @OneToOne
    private ItensCompra itensCompra;
     @JoinColumn
     @OneToOne
    private ItensCupomFiscal itensCupomFiscal;

    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(UUID id, Date data, Calendar hora, char tipo, float qtd, char status, Produto produto, ItensCompra itensCompra, ItensCupomFiscal itensCupomFiscal) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
        this.produto = produto;
        this.itensCompra = itensCompra;
        this.itensCupomFiscal = itensCupomFiscal;
    }

    public HistoricoMovimentacao(Date data, Calendar hora, char tipo, float qtd, char status, Produto produto, ItensCompra itensCompra, ItensCupomFiscal itensCupomFiscal) {
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
        this.produto = produto;
        this.itensCompra = itensCompra;
        this.itensCupomFiscal = itensCupomFiscal;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
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

    public ItensCompra getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItensCompra itensCompra) {
        this.itensCompra = itensCompra;
    }

    public ItensCupomFiscal getItensCupomFiscal() {
        return itensCupomFiscal;
    }

    public void setItensCupomFiscal(ItensCupomFiscal itensCupomFiscal) {
        this.itensCupomFiscal = itensCupomFiscal;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getData() + ";" + this.getHora() + ";" + this.getTipo() + ";" +
                this.getQtd() + ";" + this.getStatus() + ";" +
                
                this.getProduto().toString() + ";" + this.getItensCompra().toString() + ";" + this.getItensCupomFiscal().toString();
    }
    
    

    
    

    
    
    
    
    
    
    
    
    
}
