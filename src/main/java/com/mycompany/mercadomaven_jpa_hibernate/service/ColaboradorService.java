package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.ColaboradorDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Colaborador;

public class ColaboradorService{

    public static void criar(Colaborador objeto) {
        ColaboradorDAO.getInstance().create(objeto);
    }

    public static Colaborador buscar(int codigo) {
        return ColaboradorDAO.getInstance().retrieve(codigo);
    }

    public static Colaborador buscar(String descricao) {
        return ColaboradorDAO.getInstance().retrieve(descricao);
    }

    public static List<Colaborador> buscar() {
        return ColaboradorDAO.getInstance().retrieve();
    }

    public static void atualizar(Colaborador objeto) {
        ColaboradorDAO.getInstance().update(objeto);
    }

    public static void excluir(Colaborador objeto) {
        ColaboradorDAO.getInstance().delete(objeto);
    }
    
    public static Colaborador verificarAtualizar(String descricao, int codigo) {
        return ColaboradorDAO.getInstance().searchUpdate(descricao, codigo);
    }
    
}
