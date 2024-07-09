package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.ClienteDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cliente;

public class ClienteService{

    public static void criar(Cliente objeto) {
        ClienteDAO.getInstance().create(objeto);
    }

    public static Cliente buscar(int codigo) {
        return ClienteDAO.getInstance().retrieve(codigo);   
    }

    public static Cliente buscar(String descricao) {
        return ClienteDAO.getInstance().retrieve(descricao);
    }

    public static List<Cliente> buscar() {
        return ClienteDAO.getInstance().retrieve();   
    }

    public static void atualizar(Cliente objeto) {
        ClienteDAO.getInstance().update(objeto);   
    }

    public static void excluir(Cliente objeto) {
        ClienteDAO.getInstance().delete(objeto);   
    }
    
    public static Cliente verificarAtualizar(String descricao,  int codigo) {
        return ClienteDAO.getInstance().searchUpdate(descricao, codigo);
    }
    
}
