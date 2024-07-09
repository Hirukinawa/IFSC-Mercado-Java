package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Colaborador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class ColaboradorDAO implements InterfaceDAO<Colaborador> {

    private static ColaboradorDAO instance;
    protected EntityManager entityManager;

    public static ColaboradorDAO getInstance() {
        if (instance == null) {
            instance = new ColaboradorDAO();
        }
        return instance;

    }

    private ColaboradorDAO() {
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
    public void create(Colaborador objeto) {

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
    public Colaborador retrieve(int codigo) {

        return entityManager.find(Colaborador.class, codigo);

    }

    @Override
    public Colaborador retrieve(String login) {
        try {
            Colaborador colaborador = entityManager.createQuery("SELECT c FROM Colaborador c WHERE c.login = :parLogin", Colaborador.class).setParameter("parLogin", login).getSingleResult();
            return colaborador;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Colaborador> retrieve() {
        List<Colaborador> colaboradores;
        colaboradores = entityManager.createQuery("SELECT c FROM Colaborador c", Colaborador.class).getResultList();
        return colaboradores;
    }

    @Override
    public void update(Colaborador objeto) {

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
    public void delete(Colaborador objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Colaborador.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }
    
    public Colaborador searchUpdate(String login, int codigo) {

        try {
            Colaborador colaborador = entityManager.createQuery("SELECT c FROM Colaborador c WHERE c.login = :parLogin AND c.id != :parColaboradorID", Colaborador.class).setParameter("parLogin", login).setParameter("parColaboradorID", codigo).getSingleResult();
            return colaborador;
        } catch (NoResultException e) {
            return null;
        }

    }

}
