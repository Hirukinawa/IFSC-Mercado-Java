package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public abstract class Pessoa implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int         id;
    @Column 
    private String      nome;
    @Column 
    private String      fone1;
    @Column
    private String      fone2;
    @Column 
    private String      complementoEndereco;
    @Column 
    private String      email;
    @Column
    @Temporal(TemporalType.DATE)
    private Date      dtCadastro;
    @Column 
    private String      observacao;
    @Column 
    private String      status;
    
    @JoinColumn
    @ManyToOne
    private Endereco    endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dtCadastro, String observacao, String status, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.complementoEndereco = complementoEndereco;
        this.email = email;
        this.dtCadastro = dtCadastro;
        this.observacao = observacao;
        this.status = status;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
 
    
    @Override
    public String toString() {
        return this.getId() + ";" + this.getNome() + ";" + this.getFone1() + ";" + this.getFone2() + ";" +
                this.getComplementoEndereco() + ";" + this.getEmail() + ";" + this.getDtCadastro() + ";" +
                this.getObservacao() + ";" + this.getStatus() + ";" +
                
                this.getEndereco().toString();
    
    }
    
    public String stringToDate (String data) {
        
        String newData = "";
        
        int dia = 0, mes = 3, ano = 6;
        
        for (int i = ano; i < (ano+4); i++) {
            newData = newData + data.charAt(i);
        }
        
        newData = newData + '-';
        
        for (int i = mes; i < (mes+2); i++) {
            newData = newData + data.charAt(i);
        }
        
        newData = newData + '-';
        
        for (int i = dia; i < (dia+2); i++) {
            newData = newData + data.charAt(i);
        }
        
        return newData;
        
    }
    
    public String dateToString(String data) {
        
        String newData = "";
        
        int dia = 8, mes = 5, ano = 0;
        
        for (int i = dia; i < (dia+2); i++) {
            newData = newData + data.charAt(i);
        }
        
        newData = newData + '/';
        
        for (int i = mes; i < (mes+2); i++) {
            newData = newData + data.charAt(i);
        }
        
        newData = newData + '/';
        
        for (int i = ano; i < (ano+4); i++) {
            newData = newData + data.charAt(i);
        }
        
        return newData;
        
    } 
       
}
