package com.mycompany.mercadomaven_jpa_hibernate.service;

import java.util.List;
import com.mycompany.mercadomaven_jpa_hibernate.model.DAO.EnderecoDAO;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Bairro;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Cidade;
import com.mycompany.mercadomaven_jpa_hibernate.model.bo.Endereco;
import com.mycompany.mercadomaven_jpa_hibernate.utilities.Utils;

public class EnderecoService {

    public static void criar(Endereco objeto) {
        EnderecoDAO.getInstance().create(objeto);
    }

    public static Endereco buscar(int codigo) {
        return EnderecoDAO.getInstance().retrieve(codigo);

    }

    public static Endereco buscar(String descricao) {
        return EnderecoDAO.getInstance().retrieve(descricao);

    }

    public static List<Endereco> buscar() {
        return EnderecoDAO.getInstance().retrieve();
    }

    public static void atualizar(Endereco objeto) {
        EnderecoDAO.getInstance().update(objeto);

    }

    public static void excluir(Endereco objeto) {
        EnderecoDAO.getInstance().delete(objeto);

    }

    public static List<String> listaCeps() {
        return Utils.getInstance().retrieveCeps();
    }

    public static List<Cidade> listaCidades(String cep) {
        return Utils.getInstance().retrieveListCidade(cep);
    }

    public static List<Bairro> listaBairros(String cep, int cidade_id) {
        return Utils.getInstance().retrieveListBairro(cep, cidade_id);
    }

    public static List<Endereco> listaLogradouros(String cep, int cidade_id, int bairro_id) {
        return Utils.getInstance().retrieveListLogradouro(cep, cidade_id, bairro_id);
    }

    public static Endereco procuraEndereco(String cep, int cidade_id, int bairro_id, String logradouro) {
        return Utils.getInstance().search(cep, cidade_id, bairro_id, logradouro);
    }

}
