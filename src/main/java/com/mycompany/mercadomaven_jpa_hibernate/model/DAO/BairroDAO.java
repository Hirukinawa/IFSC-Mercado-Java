package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class BairroDAO implements InterfaceDAO<Bairro> {

    private static BairroDAO instance;
    protected EntityManager entityManager;

    public static BairroDAO getInstance() {
        if (instance == null) {
            instance = new BairroDAO();
        }
        return instance;

    }

    private BairroDAO() {
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
    public void create(Bairro objeto) {

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
    public Bairro retrieve(int codigo) {
        return entityManager.find(Bairro.class, codigo);
    }

    @Override
    public Bairro retrieve(String descricao) {
        try {
            Bairro bairro = entityManager.createQuery("SELECT b FROM Bairro b WHERE b.descricao = :parDescricao", Bairro.class).setParameter("parDescricao", descricao).getSingleResult();
            return bairro;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Bairro> retrieve() {
        List<Bairro> bairros;
        bairros = entityManager.createQuery("SELECT b FROM Bairro b", Bairro.class).getResultList();
        return bairros;
    }

    @Override
    public void update(Bairro objeto) {

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
    public void delete(Bairro objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Bairro.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }

}
