/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import estadoConsole.MaquinaEstadoConsole;

/**
 *
 * @author 082170013
 */
public class Main {
    
    public static MaquinaEstadoConsole estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primeiro, setar base de dados no arquivo texto
        
        // Em seguida, iniciar a maquina de estado em BEM VINDO
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        Boolean saida = false;        
        
        // Enquanto não sair, continuar executando a maquina de estado
        while (!saida) {
            saida = estadoConsole.Executa();
        }
    }
    
}
