/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.produto;

import acesso.Usuario;
import basis.Entidade;
import dao.basis.DAO;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author leandro
 */
public class ProdutoTextoDAO extends DAO {

    private final ConcurrentHashMap<String, Usuario> usuarios = new ConcurrentHashMap<>();    
    private File file = new File(File.separator + "files" + File.separator + "users.txt");
    
    public ProdutoTextoDAO()
    { 
        super(Usuario.class);
        Usuario masterUser = new Usuario();
        masterUser.setLogin("professorquero10");
        masterUser.setSenha("10");        
        usuarios.put("professorquero10", masterUser);
    }
    
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        Entidade entidade = usuarios.getOrDefault(codigo, null);
        return entidade;
    }
    
    @Override
    public ArrayList<Entidade> lista() throws SQLException {
        ArrayList<Entidade> entidades;
        entidades = new ArrayList();
        for (Usuario usuario : usuarios.values())
        {
            entidades.add(usuario);
        }
        return entidades;
    }
    
    @Override
    public boolean adiciona(String codigo) throws SQLException {
        return true;
    }
    
    @Override
    public boolean remove(String codigo) throws SQLException {
        return true;
    }
}
