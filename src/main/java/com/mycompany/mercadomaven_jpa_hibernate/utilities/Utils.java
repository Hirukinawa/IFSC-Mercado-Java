package com.mycompany.mercadomaven_jpa_hibernate.utilities;

import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import java.awt.Component;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Utils {
    
    private static Utils instance;
    protected EntityManager entityManager;

    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }
    
    private Utils() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Mercado_PU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public static void ativa(boolean estadoComponente, JPanel painel) {

        Component[] componentes = painel.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JButton) {

                if (((JButton) componente).getActionCommand() == "0") {
                    componente.setEnabled(estadoComponente);
                } else {
                    componente.setEnabled(!estadoComponente);
                }

            }

        }

    }

    public static void ligaDesliga(boolean estadoComponente, JPanel painel) {

        Component[] componentes = painel.getComponents();
        for (Component componente : componentes) {

            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(-1);
            } else if (componente instanceof JScrollPane) {
                ((JTextArea) ((JScrollPane) componente).getViewport().getComponent(0)).setText("");
            }
            componente.setEnabled(estadoComponente);
            if (componente.getName() == "0") {
                componente.setEnabled(!estadoComponente);
            }
            if (componente.getName() == "3") {
                componente.setEnabled(false);
            }

        }

    }

    public static void editar(boolean estadoComponente, JPanel painel) {

        Component[] componentes = painel.getComponents();

        for (Component componente : componentes) {

            if (componente.getName() == "1" || componente.getName() == "2") {

                componente.setEnabled(estadoComponente);

            } else if (componente.getName() == "3") {

                componente.setEnabled(false);

            } else {

                componente.setEnabled(!estadoComponente);
            }

        }

    }

    public static int confereCampoVazio(JPanel painel) {

        int count = 0;

        Component[] componentes = painel.getComponents();

        for (Component componente : componentes) {

            if (componente instanceof JTextField) {
                if (componente.isEnabled()) {
                    if (componente.getName() == "1" && ((JTextField) componente).getText().isEmpty()) {
                        count++;
                    }
                }
            } else if (componente instanceof JComboBox) {
                if (((JComboBox) componente).getSelectedIndex() == -1) {
                    count++;
                }
            } else if (componente instanceof JPasswordField) {
                if (componente.getName() == "1" && ((JPasswordField) componente).getText().equalsIgnoreCase("")) {
                    count++;
                }
            }

        }

        return count;

    }
    
    public List<String> retrieveCeps() {
        List<String> ceps;
        ceps = entityManager.createQuery("SELECT DISTINCT e.cep FROM Endereco e", String.class).getResultList();
        return ceps;
    }

    public List<Cidade> retrieveListCidade(String cep) {
        List<Cidade> cidades;
        cidades = entityManager.createQuery("SELECT DISTINCT c FROM Endereco e JOIN e.cidade c WHERE e.cep = :parCep", Cidade.class).setParameter("parCep", cep).getResultList();
        return cidades;
    }

    public List<Bairro> retrieveListBairro(String cep, int cidade_id) {
        List<Bairro> bairros;
        bairros = entityManager.createQuery("SELECT DISTINCT b FROM Endereco e JOIN e.bairro b JOIN e.cidade c WHERE e.cep = :parCep AND c.id = :parCidadeID", Bairro.class).setParameter("parCep", cep).setParameter("parCidadeID", cidade_id).getResultList();
        return bairros;
    }

    public List<Endereco> retrieveListLogradouro(String cep, int cidade_id, int bairro_id) {
        List<Endereco> logradouros;
        logradouros = entityManager.createQuery("SELECT DISTINCT e FROM Endereco e JOIN e.bairro b JOIN e.cidade c WHERE e.cep = :parCep AND c.id = :parCidadeID AND b.id = :parBairroID", Endereco.class).setParameter("parCep", cep).setParameter("parCidadeID", cidade_id).setParameter("parBairroID", bairro_id).getResultList();
        return logradouros;
    }

    public Endereco search(String cep, int cidade_id, int bairro_id, String logradouro) {
        try {
            Endereco endereco = entityManager.createQuery("SELECT e FROM Endereco e JOIN e.bairro b "
                    + "JOIN e.cidade c WHERE e.cep = :parCep AND c.id = :parCidadeID "
                    + "AND b.id = :parBairroID AND e.logradouro = :parLogradouro", Endereco.class).setParameter("parCep", cep).setParameter("parCidadeID", cidade_id).setParameter("parBairroID", bairro_id).setParameter("parLogradouro", logradouro).getSingleResult();
            return endereco;
        } catch (NoResultException e) {
            return null;
        }

    }

}