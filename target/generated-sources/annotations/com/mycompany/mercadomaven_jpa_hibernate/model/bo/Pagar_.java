package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Compra;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:00:21")
@StaticMetamodel(Pagar.class)
public class Pagar_ { 

    public static volatile SingularAttribute<Pagar, Compra> compra;
    public static volatile SingularAttribute<Pagar, Date> dataVencimento;
    public static volatile SingularAttribute<Pagar, Integer> id;
    public static volatile SingularAttribute<Pagar, Float> valorPagar;
    public static volatile SingularAttribute<Pagar, Date> dataEmissao;
    public static volatile SingularAttribute<Pagar, Calendar> horaEmissao;
    public static volatile SingularAttribute<Pagar, Character> status;

}