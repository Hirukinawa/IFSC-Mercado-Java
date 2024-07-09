package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CondicaoPgto;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Fornecedor;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:10:11")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Float> totalNF;
    public static volatile SingularAttribute<Compra, String> tipoNF;
    public static volatile SingularAttribute<Compra, Float> valorDesconto;
    public static volatile SingularAttribute<Compra, Float> valorAcrescimo;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, String> numeroNF;
    public static volatile SingularAttribute<Compra, Fornecedor> fornecedor;
    public static volatile SingularAttribute<Compra, Calendar> horaCompra;
    public static volatile SingularAttribute<Compra, CondicaoPgto> condicaoPgto;
    public static volatile SingularAttribute<Compra, Date> dataCompra;
    public static volatile SingularAttribute<Compra, Character> status;

}