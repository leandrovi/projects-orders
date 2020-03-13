/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;

import crud.Main;
import java.util.Scanner;

/**
 *
 * @author 082170032
 */
public class EstadoConsoleBemVindo extends MaquinaEstadoConsole{

    @Override
    public boolean Executa() {
        boolean sair = false;
        
        System.out.println("Bem-vindo!");
        System.out.println("Indique a opção desejada!");
        System.out.println("0 - Sair");
        System.out.println("1 - Login");
        Scanner scan = new Scanner(System.in);
        
        int opcao = scan.nextInt();
        
        switch (opcao)
        {
            case 0:
                sair = true;
                break;
            case 1:
                Main.estadoConsole = EnumEstadoConsole.LOGIN.getEstadoMaquina();
                break;
        }
        return sair;
    }
}
