package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.BairroDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;

public class BairroService{

    public static void criar(Bairro objeto) {
        BairroDAO.getInstance().create(objeto);
    }

    public static Bairro buscar(int codigo) {
        return BairroDAO.getInstance().retrieve(codigo);
    }

    public static Bairro buscar(String descricao) {
        return BairroDAO.getInstance().retrieve(descricao);
    }

    public static List<Bairro> buscar() {
        return BairroDAO.getInstance().retrieve();
        
    }

    public static void atualizar(Bairro objeto) {
        BairroDAO.getInstance().update(objeto);        
    }

    public static void excluir(Bairro objeto) {
        BairroDAO.getInstance().delete(objeto);
        
    }
    
}
