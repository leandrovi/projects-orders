/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.arquivo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import basis.Entidade;
import dao.basis.DAO;
import dao.basis.FabricaDAOs;
import java.util.ArrayList;
import repositorio.basis.Repositorio;

/**
 *
 * @author leandro
 */
public class RepositorioArquivos extends Repositorio {

    @Override
    public Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = dao.seleciona(id);
        return entidade;
    }

    @Override
    public Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = null;
        try {
            entidade = dao.localiza(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entidade;
    }
    
    @Override
    public ArrayList<Entidade> lista(EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        ArrayList<Entidade> entidades = null;
        
        try {
            entidades = dao.lista();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entidades;
    }
    
    @Override
    public boolean adiciona(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        boolean adicionado = false;
        
        try {
            adicionado = dao.adiciona(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adicionado;
    }
    
    @Override
    public boolean remove(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        boolean removido = false;
        
        try {
            removido = dao.remove(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return removido;
    }
    
}