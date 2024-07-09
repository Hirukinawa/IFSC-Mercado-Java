package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.ProdutoDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;

public class ProdutoService{

    public static void criar(Produto objeto) {
        ProdutoDAO.getInstance().create(objeto);
    }

    public static Produto buscar(int codigo) {
        return ProdutoDAO.getInstance().retrieve(codigo);
    }

    public static Produto buscar(String descricao) {
        return ProdutoDAO.getInstance().retrieve(descricao);
    }

    public static List<Produto> buscar() {
        return ProdutoDAO.getInstance().retrieve();
    }

    public static void atualizar(Produto objeto) {
        ProdutoDAO.getInstance().update(objeto);        
    }

    public static void excluir(Produto objeto) {
        ProdutoDAO.getInstance().delete(objeto);
    }
    
    public static Produto verificar(String descricao, int marca_id) {
        return ProdutoDAO.getInstance().search(descricao, marca_id);
    }
    
    public static Produto verificarAtualizar(String descricao, int marca_id, int codigo) {
        return ProdutoDAO.getInstance().searchUpdate(descricao, marca_id, codigo);
    }
    
}
