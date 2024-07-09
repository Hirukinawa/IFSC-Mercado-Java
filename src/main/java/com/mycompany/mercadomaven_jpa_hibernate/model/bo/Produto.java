package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import java.io.Serializable;
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
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricao;
    @Column
    private float valorCompra;
    @Column
    private float valorVenda;
    @Column
    private String undCompra;
    @Column
    private String undVenda;
    @Column
    private int fatorConversao;
    @Column
    private String barraEntrada;
    @Column
    private String barraSaida;
    @Column
    private String status;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column
    private float estoqueMinimo;
    @Column
    private float estoqueMaximo;

    @ManyToOne
    @JoinColumn
    private Marca marca;
    @JoinColumn
    @ManyToOne
    private Classe classe;

    public Produto() {
    }

    public Produto(int id, String descricao, float valorCompra, float valorVenda, String undCompra, String undVenda, int fatorConversao, String status, Date dataCadastro, String barraEntrada, String barraSaida, float estoqueMinimo, float estoqueMaximo, Marca marca, Classe classe) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.undCompra = undCompra;
        this.undVenda = undVenda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.barraEntrada = barraEntrada;
        this.barraSaida = barraSaida;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.marca = marca;
        this.classe = classe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUndCompra() {
        return undCompra;
    }

    public void setUndCompra(String undCompra) {
        this.undCompra = undCompra;
    }

    public String getUndVenda() {
        return undVenda;
    }

    public void setUndVenda(String undVenda) {
        this.undVenda = undVenda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return this.getId() + ";" + this.getDescricao() + ";" + this.getValorCompra() + ";"
                + this.getValorVenda() + ";" + this.getUndVenda() + ";" + this.getFatorConversao() + ";"
                + this.getStatus() + ";" + this.getDataCadastro() + ";"
                + this.getBarraEntrada() + ";" + this.getBarraSaida() + ";" + this.getEstoqueMinimo() + ";"
                + this.getEstoqueMaximo() + ";"
                + this.getMarca().toString() + ";" + this.getClasse().toString();

    }

    public String stringToDate(String data) {

        String newData = "";

        int dia = 0, mes = 3, ano = 6;

        for (int i = ano; i < (ano + 4); i++) {
            newData = newData + data.charAt(i);
        }

        newData = newData + '-';

        for (int i = mes; i < (mes + 2); i++) {
            newData = newData + data.charAt(i);
        }

        newData = newData + '-';

        for (int i = dia; i < (dia + 2); i++) {
            newData = newData + data.charAt(i);
        }

        return newData;

    }

    public String dateToString(String data) {

        String newData = "";

        int dia = 8, mes = 5, ano = 0;

        for (int i = dia; i < (dia + 2); i++) {
            newData = newData + data.charAt(i);
        }

        newData = newData + '/';

        for (int i = mes; i < (mes + 2); i++) {
            newData = newData + data.charAt(i);
        }

        newData = newData + '/';

        for (int i = ano; i < (ano + 4); i++) {
            newData = newData + data.charAt(i);
        }

        return newData;

    }

}
