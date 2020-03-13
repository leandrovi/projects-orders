/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.basis;

import enums.EntidadesDisponiveis;
import enums.TipoRepositorio;
import acesso.Usuario;
import dao.acesso.UsuarioMySQLDAO;
import dao.acesso.UsuarioTextoDAO;
import dao.pedido.PedidoTextoDAO;
import dao.produto.ProdutoTextoDAO;
import dao.cliente.ClienteTextoDAO;


/**
 *
 * @author leandro
 */
public class FabricaDAOs {
    
    public static DAO Fabrica(EntidadesDisponiveis enumEntidade, TipoRepositorio repositorio) {
        switch (repositorio)
        {
            case TEXTO:
                return montaDAOTexto(enumEntidade);
            case MYSQL:
                return montaDAOMySQL(enumEntidade);
            default:
                return null;
        }
       
    }

    private static DAO montaDAOTexto(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioTextoDAO();
                break;    
            case PEDIDO:
                retorno = new PedidoTextoDAO();
                break;    
            case PRODUTO:
                retorno = new ProdutoTextoDAO();
                break;  
            case CLIENTE:
                retorno = new ClienteTextoDAO();
                break;         
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
    private static DAO montaDAOMySQL(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioMySQLDAO();
                break;   
//            case PEDIDO:
//                retorno = new UsuarioMySQLDAO();
//                break;    
//            case PRODUTO:
//                retorno = new UsuarioMySQLDAO();
//                break;  
//            case CLIENTE:
//                retorno = new UsuarioMySQLDAO();
//                break;         
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
}
