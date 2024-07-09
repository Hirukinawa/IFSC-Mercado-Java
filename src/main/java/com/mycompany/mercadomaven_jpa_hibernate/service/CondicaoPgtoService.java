package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.CondicaoPgtoDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CondicaoPgto;

public class CondicaoPgtoService{

    public static void criar(CondicaoPgto objeto) {
        CondicaoPgtoDAO.getInstance().create(objeto);
    }

    public static CondicaoPgto buscar(int codigo) {
        return CondicaoPgtoDAO.getInstance().retrieve(codigo);
    }

    public static CondicaoPgto buscar(String descricao) {
        return CondicaoPgtoDAO.getInstance().retrieve(descricao);
    }

    public static List<CondicaoPgto> buscar() {
        return CondicaoPgtoDAO.getInstance().retrieve();
    }

    public static void atualizar(CondicaoPgto objeto) {
        CondicaoPgtoDAO.getInstance().update(objeto);
    }

    public static void excluir(CondicaoPgto objeto) {
        CondicaoPgtoDAO.getInstance().delete(objeto);
    }
    
}
