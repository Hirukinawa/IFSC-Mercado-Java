package com.mycompany.mercadomaven_jpa_hibernate.model.bo;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-08T21:00:21")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> observacao;
    public static volatile SingularAttribute<Endereco, Cidade> cidade;
    public static volatile SingularAttribute<Endereco, String> logradouro;
    public static volatile SingularAttribute<Endereco, Bairro> bairro;
    public static volatile SingularAttribute<Endereco, Integer> id;
    public static volatile SingularAttribute<Endereco, String> cep;
    public static volatile SingularAttribute<Endereco, String> status;

}