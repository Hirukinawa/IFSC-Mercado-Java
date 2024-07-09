package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    private static CidadeDAO instance;
    protected EntityManager entityManager;

    public static CidadeDAO getInstance() {
        if (instance == null) {
            instance = new CidadeDAO();
        }
        return instance;

    }
    
    private CidadeDAO() {
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
    public void create(Cidade objeto) {

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
    public Cidade retrieve(int codigo) {
        return entityManager.find(Cidade.class, codigo);
    }

    @Override
    public Cidade retrieve(String descricao) {
        try {
            
            Cidade cidade = entityManager.createQuery("SELECT c FROM Cidade c WHERE c.descricao = :parDescricao", Cidade.class).setParameter("parDescricao", descricao).getSingleResult();
            return cidade;
            
        } catch (NoResultException e) {
            
            return null;
            
        }
    }

    @Override
    public List<Cidade> retrieve() {
        List<Cidade> cidades;
        cidades = entityManager.createQuery("SELECT c FROM Cidade c", Cidade.class).getResultList();
        return cidades;
    }
    
    @Override
    public void update(Cidade objeto) {

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
    public void delete(Cidade objeto) {
        try{
        entityManager.getTransaction().begin();
        objeto = entityManager.find(Cidade.class, objeto.getId());
        entityManager.remove(objeto);
        entityManager.getTransaction().commit();
                
        }catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }    
        
    }
    
}
