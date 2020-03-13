/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import annotations.CampoNoBanco;
import basis.Entidade;

/**
 *
 * @author leandro
 */
public class Produto extends Entidade {
    
    @CampoNoBanco(nome = "nome", chave = true)
    private String nome;

    public String getName() {
        return  nome;
    }
    
    public void setName(String login) {
        this.nome = login;
    }
    
}
