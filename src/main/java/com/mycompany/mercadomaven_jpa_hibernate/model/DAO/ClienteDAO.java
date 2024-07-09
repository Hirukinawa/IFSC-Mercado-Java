package com.mycompany.mercadomaven_jpa_hibernate.model.DAO;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    private static ClienteDAO instance;
    protected EntityManager entityManager;

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;

    }

    private ClienteDAO() {
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
    public void create(Cliente objeto) {

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
    public Cliente retrieve(int codigo) {

        return entityManager.find(Cliente.class, codigo);

    }

    @Override
    public Cliente retrieve(String cpf) {
        try {
            Cliente cliente = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cpf = :parCpf", Cliente.class).setParameter("parCpf", cpf).getSingleResult();
            return cliente;
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<Cliente> retrieve() {
        List<Cliente> clientes;
        clientes = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        return clientes;
    }

    @Override
    public void update(Cliente objeto) {

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
    public void delete(Cliente objeto) {
        try {
            entityManager.getTransaction().begin();
            objeto = entityManager.find(Cliente.class, objeto.getId());
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }
    
    public Cliente searchUpdate(String cpf, int codigo) {

        try {
            Cliente cliente = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cpf = :parCpf AND c.id != :parClienteID", Cliente.class).setParameter("parCpf", cpf).setParameter("parClienteID", codigo).getSingleResult();
            return cliente;
        } catch (NoResultException e) {
            return null;
        }

    }

}
