package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Fornecedor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    private static FornecedorDAO instance;
    protected EntityManager entityManager;

    public static FornecedorDAO getInstance() {
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        return instance;

    }

    private FornecedorDAO() {
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
    public void create(Fornecedor objeto) {

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
    public Fornecedor retrieve(int codigo) {

        return entityManager.find(Fornecedor.class, codigo);

    }

    @Override
    public Fornecedor retrieve(String nome) {
        try {
            Fornecedor fornecedor = entityManager.createQuery("SELECT f FROM Fornecedor f WHERE f.nome = :parNome", Fornecedor.class).setParameter("parNome", nome).getSingleResult();
            return fornecedor;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        List<Fornecedor> fornecedores;
        fornecedores = entityManager.createQuery("SELECT f FROM Fornecedor f", Fornecedor.class).getResultList();
        return fornecedores;
    }

    @Override
    public void update(Fornecedor objeto) {

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
    public void delete(Fornecedor objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Fornecedor.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }

    }
    
    public Fornecedor searchUpdate(String nome, int codigo) {

        try {
            Fornecedor fornecedor = entityManager.createQuery("SELECT f FROM Fornecedor f WHERE f.nome = :parNome AND f.id != :parFornecedorID", Fornecedor.class).setParameter("parNome", nome).setParameter("parFornecedorID", codigo).getSingleResult();
            return fornecedor;
        } catch (NoResultException e) {
            return null;
        }

    }

}
