package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Pagar;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:10:11")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, Pagar> pagar;
    public static volatile SingularAttribute<Pagamento, Date> dataPagamento;
    public static volatile SingularAttribute<Pagamento, Float> valorDesconto;
    public static volatile SingularAttribute<Pagamento, Float> valorAcrescimo;
    public static volatile SingularAttribute<Pagamento, Calendar> horaPagamento;
    public static volatile SingularAttribute<Pagamento, Float> valorPago;
    public static volatile SingularAttribute<Pagamento, Integer> id;
    public static volatile SingularAttribute<Pagamento, Character> status;

}