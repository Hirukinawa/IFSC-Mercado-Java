package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cliente;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Colaborador;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:00:21")
@StaticMetamodel(CupomFiscal.class)
public class CupomFiscal_ { 

    public static volatile SingularAttribute<CupomFiscal, Colaborador> colaborador;
    public static volatile SingularAttribute<CupomFiscal, Calendar> horaVenda;
    public static volatile SingularAttribute<CupomFiscal, Cliente> cliente;
    public static volatile SingularAttribute<CupomFiscal, Float> totalCupom;
    public static volatile SingularAttribute<CupomFiscal, Date> dataVenda;
    public static volatile SingularAttribute<CupomFiscal, Float> valorDesconto;
    public static volatile SingularAttribute<CupomFiscal, Float> valorAcrescimo;
    public static volatile SingularAttribute<CupomFiscal, UUID> id;
    public static volatile SingularAttribute<CupomFiscal, Character> status;

}