package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Compra;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:10:11")
@StaticMetamodel(ItensCompra.class)
public class ItensCompra_ { 

    public static volatile SingularAttribute<ItensCompra, Float> qtdProduto;
    public static volatile SingularAttribute<ItensCompra, Compra> compra;
    public static volatile SingularAttribute<ItensCompra, Float> valorUnitarioProduto;
    public static volatile SingularAttribute<ItensCompra, Produto> produto;
    public static volatile SingularAttribute<ItensCompra, Integer> id;
    public static volatile SingularAttribute<ItensCompra, Character> status;

}