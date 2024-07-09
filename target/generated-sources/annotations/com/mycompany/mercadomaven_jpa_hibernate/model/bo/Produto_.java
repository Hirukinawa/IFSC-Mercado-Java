package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Classe;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:00:21")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> estoqueMaximo;
    public static volatile SingularAttribute<Produto, Classe> classe;
    public static volatile SingularAttribute<Produto, Float> valorCompra;
    public static volatile SingularAttribute<Produto, String> barraSaida;
    public static volatile SingularAttribute<Produto, String> descricao;
    public static volatile SingularAttribute<Produto, Marca> marca;
    public static volatile SingularAttribute<Produto, String> undCompra;
    public static volatile SingularAttribute<Produto, Float> valorVenda;
    public static volatile SingularAttribute<Produto, String> undVenda;
    public static volatile SingularAttribute<Produto, String> barraEntrada;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, Date> dataCadastro;
    public static volatile SingularAttribute<Produto, Float> estoqueMinimo;
    public static volatile SingularAttribute<Produto, Integer> fatorConversao;
    public static volatile SingularAttribute<Produto, String> status;

}