package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.MarcaDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;

public class MarcaService{

    public static void criar(Marca objeto) {
        MarcaDAO.getInstance().create(objeto);
    }

    public static Marca buscar(int codigo) {
        return MarcaDAO.getInstance().retrieve(codigo);
    }

    public static Marca buscar(String descricao) {
        return MarcaDAO.getInstance().retrieve(descricao);
    }

    public static List<Marca> buscar() {
        return MarcaDAO.getInstance().retrieve();
    }

    public static void atualizar(Marca objeto) {
        MarcaDAO.getInstance().update(objeto);
    }

    public static void excluir(Marca objeto) {
        MarcaDAO.getInstance().delete(objeto);
    }
    
}
