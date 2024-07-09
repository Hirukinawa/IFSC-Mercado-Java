package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Fornecedor extends Pessoa {
     @Column
    private String cnpj;
     @Column
    private String inscEstadual;
     @Column
    private String contato;
     @Column
    private String razaoSocial;
     @Column
    private String cpf;
     @Column
    private String rg;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscEstadual, String contato, String razaoSocial, String cpf, String rg) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Fornecedor(String cnpj, String inscEstadual, String contato, String razaoSocial, String cpf, String rg, int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dtCadastro, String observacao, String status, Endereco endereco) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, endereco);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
        
    @Override
    public String toString() {
        return super.toString() + ";" + this.getCnpj() + ";" + this.getInscEstadual() + ";" + this.getContato()
                 + ";" + this.getRazaoSocial() + ";" + this.getCpf() + ";" + this.getRg();
    }  
    
}
