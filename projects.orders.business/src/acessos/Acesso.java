/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessos;

import acesso.Usuario; // Comuns
import basis.Entidade;
import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import java.util.ArrayList;
import repositorio.basis.Repositorio;

/**
 *
 * @author 082170013
 */
public class Acesso {
    
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(Usuario user) {
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica(); // repositorioArquivos    
        Usuario usuario = (Usuario)repositorio.localiza(user.getLogin(), EntidadesDisponiveis.USUARIO);
        
        if (usuario != null)
        {
            retorno = validaSenha(usuario.getSenha(), user.getSenha());
        }
        
        return retorno;
    }
    
    public ArrayList<Entidade> listaUsuarios() {
        Repositorio repositorio = FabricaRepositorio.Fabrica();
        ArrayList<Entidade> usuarios = repositorio.lista(EntidadesDisponiveis.USUARIO);
        
        return usuarios;
    }
    
    public boolean adicionarUsuario(Usuario user) {
        boolean retorno;
        Repositorio repositorio = FabricaRepositorio.Fabrica();
        
        String stringUsuario = user.getLogin() + user.getSenha();
        
        retorno = repositorio.adiciona(stringUsuario, EntidadesDisponiveis.USUARIO);
        
        return retorno;
    }
}
