package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    private static EnderecoDAO instance;
    protected EntityManager entityManager;

    public static EnderecoDAO getInstance() {
        if (instance == null) {
            instance = new EnderecoDAO();
        }
        return instance;
    }

    private EnderecoDAO() {
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
    public void create(Endereco objeto) {

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
    public Endereco retrieve(int codigo) {

        return entityManager.find(Endereco.class, codigo);

    }

    @Override
    public Endereco retrieve(String cep) {
        try {
            Endereco endereco = entityManager.createQuery("SELECT e FROM Endereco e WHERE e.cep = :parCep", Endereco.class).setParameter("parCep", cep).getSingleResult();
            return endereco;
        } catch (NonUniqueResultException e) {
            return null;
        }

    }

    @Override
    public List<Endereco> retrieve() {
        List<Endereco> enderecos;
        enderecos = entityManager.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
        return enderecos;
    }

    @Override
    public void update(Endereco objeto) {

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
    public void delete(Endereco objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Endereco.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }

    }

}
