package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Pagar implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar horaEmissao;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column
    private float valorPagar;
    @Column
    private char status;
    @JoinColumn
    @ManyToOne
    private Compra compra;

    public Pagar() {
    }

    public Pagar(int id, Date dataEmissao, Calendar horaEmissao, Date dataVencimento, float valorPagar, char status, Compra compra) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPagar = valorPagar;
        this.status = status;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Calendar getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(Calendar horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getDataEmissao() + ";" + this.getHoraEmissao() + ";" +
                this.getDataVencimento() + ";" + this.getValorPagar() + ";" + this.getStatus() + ";" +
              
                this.getCompra().toString();
                
    }
    
    
    
    
}
