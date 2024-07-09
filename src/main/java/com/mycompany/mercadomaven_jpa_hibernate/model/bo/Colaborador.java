package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Colaborador extends Pessoa{
      @Column
    private String login;
        @Column
    private String senha;

    public Colaborador() {
    }

    public Colaborador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Colaborador(String login, String senha, int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dtCadastro, String observacao, String status, Endereco endereco) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, endereco);
        this.login = login;
        this.senha = senha;
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ";" + this.getLogin() + ";" + this.getSenha();
    }
    
}
