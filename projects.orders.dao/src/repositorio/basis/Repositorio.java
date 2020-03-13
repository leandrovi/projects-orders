/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.basis;

import basis.Entidade;
import enums.EntidadesDisponiveis;

/**
 *
 * @author 082170013
 */
public abstract class Repositorio {
    public abstract Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade);
    public abstract Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade);
}
