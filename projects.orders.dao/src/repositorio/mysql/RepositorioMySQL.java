/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.mysql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import basis.Entidade;
import dao.basis.DAO;
import dao.basis.FabricaDAOs;
import java.util.ArrayList;
import repositorio.arquivo.RepositorioArquivos;
import repositorio.basis.Repositorio;

/**
 *
 * @author leandro
 */
public class RepositorioMySQL  extends Repositorio {

    @Override
    public Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        Entidade entidade = dao.seleciona(id);
        return entidade;
    }

    @Override
    public Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.MYSQL);
        Entidade entidade = null;
        try {
            entidade = dao.localiza(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entidade;
    }
    
    @Override
    public ArrayList<Entidade> lista(EntidadesDisponiveis tipoEntidade) {
        return null;
    }
    
    @Override
    public boolean adiciona(String codigo, EntidadesDisponiveis tipoEntidade) {
        return true;
    }
    
    @Override
    public boolean remove(String codigo, EntidadesDisponiveis tipoEntidade) {
        return true;
    }
}
