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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CupomFiscal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Column
    @Temporal(TemporalType.TIME)
    private Calendar horaVenda;
    @Column
    private float valorDesconto;
    @Column
    private float valorAcrescimo;
    @Column
    private float totalCupom;
    @Column
    private char status;
    
    private Cliente cliente;
    private Colaborador colaborador;

    public CupomFiscal() {
    }

    public CupomFiscal(UUID id, Date dataVenda, Calendar horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status, Cliente cliente, Colaborador colaborador) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
        this.cliente = cliente;
        this.colaborador = colaborador;
    }

    public CupomFiscal(Date dataVenda, Calendar horaVenda, float valorDesconto, float valorAcrescimo, float totalCupom, char status, Cliente cliente, Colaborador colaborador) {
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalCupom = totalCupom;
        this.status = status;
        this.cliente = cliente;
        this.colaborador = colaborador;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Calendar getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(Calendar horaVenda) {
        this.horaVenda = horaVenda;
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

    public float getTotalCupom() {
        return totalCupom;
    }

    public void setTotalCupom(float totalCupom) {
        this.totalCupom = totalCupom;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getDataVenda() + ";" + this.getHoraVenda() + ";" + this.getValorDesconto() + ";" +
                this.getValorAcrescimo() + ";" + this.getTotalCupom() + ";" + this.getStatus() + ";" +
                
                this.getCliente().toString() + ";" + this.getColaborador().toString();
    }

    
    
    
}
