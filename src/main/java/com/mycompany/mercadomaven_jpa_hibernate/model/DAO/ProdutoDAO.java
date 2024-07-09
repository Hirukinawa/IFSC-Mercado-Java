package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class ProdutoDAO implements InterfaceDAO<Produto> {

    private static ProdutoDAO instance;
    protected EntityManager entityManager;

    public static ProdutoDAO getInstance() {
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        return instance;

    }

    private ProdutoDAO() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Mercado_PU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    @Override
    public void create(Produto objeto) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public Produto retrieve(int codigo) {
        return entityManager.find(Produto.class, codigo);

    }

    @Override
    public Produto retrieve(String descricao) {
        try {
            Produto produto = entityManager.createQuery("SELECT p FROM Produto p WHERE p.descricao = :parDescricao", Produto.class).setParameter("parDescricao", descricao).getSingleResult();
            return produto;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Produto> retrieve() {
        List<Produto> produtos;
        produtos = entityManager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
        return produtos;
    }

    @Override
    public void update(Produto objeto
    ) {

        try {
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Produto objeto
    ) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Produto.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }

    public Produto search(String descricao, int marca_id) {

        try {
            Produto produto = entityManager.createQuery("SELECT p FROM Produto p JOIN p.marca m WHERE p.descricao = :parDescricao AND m.id = :parMarcaID", Produto.class).setParameter("parDescricao", descricao).setParameter("parMarcaID", marca_id).getSingleResult();
            return produto;

        } catch (NoResultException e) {
            return null;
        }

    }

    public Produto searchUpdate(String descricao, int marca_id, int codigo) {

        try {
            Produto produto = entityManager.createQuery("SELECT p FROM Produto p JOIN p.marca m WHERE p.descricao = :parDescricao AND m.id = :parMarcaID AND p.id != :parProdutoID", Produto.class).setParameter("parDescricao", descricao).setParameter("parMarcaID", marca_id).setParameter("parProdutoID", codigo).getSingleResult();
            return produto;

        } catch (NoResultException e) {
            return null;
        }

    }
}
