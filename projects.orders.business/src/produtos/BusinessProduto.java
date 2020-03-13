/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import produto.Produto;
import basis.Entidade;
import basis.FabricaRepositorio;
import enums.EntidadesDisponiveis;
import java.util.ArrayList;
import repositorio.basis.Repositorio;

/**
 *
 * @author leandro
 */
public class BusinessProduto {  
    
    public ArrayList<Entidade> listarProdutos() {
        Repositorio repositorio = FabricaRepositorio.Fabrica();
        ArrayList<Entidade> produtos = repositorio.lista(EntidadesDisponiveis.PRODUTO);
        
        return produtos;
    }
    
//    public boolean adicionarProduto(Produto user) {
//        boolean retorno;
//        Repositorio repositorio = FabricaRepositorio.Fabrica();
//        
//        String stringUsuario = user.getLogin() + user.getSenha();
//        
//        retorno = repositorio.adiciona(stringUsuario, EntidadesDisponiveis.USUARIO);
//        
//        return retorno;
//    }
}
