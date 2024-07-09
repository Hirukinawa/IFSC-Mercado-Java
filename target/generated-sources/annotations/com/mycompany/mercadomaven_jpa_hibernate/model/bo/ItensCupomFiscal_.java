package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CupomFiscal;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:10:11")
@StaticMetamodel(ItensCupomFiscal.class)
public class ItensCupomFiscal_ { 

    public static volatile SingularAttribute<ItensCupomFiscal, Float> qtdProduto;
    public static volatile SingularAttribute<ItensCupomFiscal, Float> valorUnitarioProduto;
    public static volatile SingularAttribute<ItensCupomFiscal, Produto> produto;
    public static volatile SingularAttribute<ItensCupomFiscal, CupomFiscal> cupomFiscal;
    public static volatile SingularAttribute<ItensCupomFiscal, UUID> id;
    public static volatile SingularAttribute<ItensCupomFiscal, Character> status;

}