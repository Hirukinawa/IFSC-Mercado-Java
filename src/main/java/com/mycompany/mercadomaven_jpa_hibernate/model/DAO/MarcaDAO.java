package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Marca;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class MarcaDAO implements InterfaceDAO<Marca> {

    private static MarcaDAO instance;
    protected EntityManager entityManager;

    public static MarcaDAO getInstance() {
        if (instance == null) {
            instance = new MarcaDAO();
        }
        return instance;

    }

    private MarcaDAO() {
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
    public void create(Marca objeto) {

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
    public Marca retrieve(int codigo) {

        return entityManager.find(Marca.class, codigo);

    }

    @Override
    public Marca retrieve(String descricao) {
        try {
            
            Marca marca = entityManager.createQuery("SELECT m FROM Marca m WHERE m.descricao = :parDescricao", Marca.class).setParameter("parDescricao", descricao).getSingleResult();
            return marca;
            
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Marca> retrieve() {
        List<Marca> marcas;
        marcas = entityManager.createQuery("SELECT m FROM Marca m", Marca.class).getResultList();
        return marcas;
    }

    @Override
    public void update(Marca objeto) {

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
    public void delete(Marca objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Marca.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }
    
}
