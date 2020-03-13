/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basis;

import enums.TipoRepositorio;
import repositorio.basis.Repositorio;
import config.Config;

import repositorio.mysql.RepositorioMySQL;
import repositorio.arquivo.RepositorioArquivos;

/**
 *
 * @author leandro
 */
public class  FabricaRepositorio {

    public static Repositorio Fabrica() {
        if (Config.getInstance().getTipoRepositorio() == TipoRepositorio.MYSQL)
            return new RepositorioMySQL();
        else
            // Em nosso desafio de N1, vamos utilizar RepositorioArquivos
            return new RepositorioArquivos();
    }
}
