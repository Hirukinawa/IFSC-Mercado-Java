package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.ItensCompra;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.ItensCupomFiscal;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:00:21")
@StaticMetamodel(HistoricoMovimentacao.class)
public class HistoricoMovimentacao_ { 

    public static volatile SingularAttribute<HistoricoMovimentacao, Float> qtd;
    public static volatile SingularAttribute<HistoricoMovimentacao, Character> tipo;
    public static volatile SingularAttribute<HistoricoMovimentacao, Date> data;
    public static volatile SingularAttribute<HistoricoMovimentacao, Produto> produto;
    public static volatile SingularAttribute<HistoricoMovimentacao, Calendar> hora;
    public static volatile SingularAttribute<HistoricoMovimentacao, ItensCupomFiscal> itensCupomFiscal;
    public static volatile SingularAttribute<HistoricoMovimentacao, UUID> id;
    public static volatile SingularAttribute<HistoricoMovimentacao, ItensCompra> itensCompra;
    public static volatile SingularAttribute<HistoricoMovimentacao, Character> status;

}