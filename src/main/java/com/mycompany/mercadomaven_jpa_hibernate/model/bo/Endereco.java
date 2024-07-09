package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String logradouro;
    @Column
    private String cep;
    @Column
    private String observacao;
    @Column
    private String status;
    @JoinColumn
    @ManyToOne
    private Bairro bairro;
    @JoinColumn
    @ManyToOne
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String logradouro, String cep, String observacao, String status, Bairro bairro, Cidade cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.observacao = observacao;
        this.status = status;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getLogradouro() + ";" + this.getCep() + ";" + this.getObservacao() + ";" + this.getStatus() + ";" +
                this.getBairro().toString() + ";" + this.getCidade().toString();
    }
}
