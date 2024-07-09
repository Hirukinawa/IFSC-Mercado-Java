package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.CondicaoPgto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class CondicaoPgtoDAO implements InterfaceDAO<CondicaoPgto> {

    private static CondicaoPgtoDAO instance;
    protected EntityManager entityManager;

    public static CondicaoPgtoDAO getInstance() {
        if (instance == null) {
            instance = new CondicaoPgtoDAO();
        }
        return instance;

    }

    private CondicaoPgtoDAO() {
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
    public void create(CondicaoPgto objeto) {

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
    public CondicaoPgto retrieve(int codigo) {

        return entityManager.find(CondicaoPgto.class, codigo);

    }

    @Override
    public CondicaoPgto retrieve(String descricao) {
        try {
            
            CondicaoPgto condicaoPgto = entityManager.createQuery("SELECT c FROM CondicaoPgto c WHERE c.descricaoCondicao = :parDescricao", CondicaoPgto.class).setParameter("parDescricao", descricao).getSingleResult();
            return condicaoPgto;
            
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<CondicaoPgto> retrieve() {
        List<CondicaoPgto> condicaoPgtos;
        condicaoPgtos = entityManager.createQuery("SELECT c FROM CondicaoPgto c", CondicaoPgto.class).getResultList();
        return condicaoPgtos;
    }

    @Override
    public void update(CondicaoPgto objeto) {

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
    public void delete(CondicaoPgto objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(CondicaoPgto.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
        
    }
    
}
