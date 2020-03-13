/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author 082170013
 */
public enum EntidadesDisponiveis {
   
    USUARIO("usuario"),

    PEDIDO("pedido"),

    PRODUTO("produto");
 
    private String descricao;
 
    EntidadesDisponiveis(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
