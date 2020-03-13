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
public class EstadoConsoleMenuPrincipal extends MaquinaEstadoConsole {
   @Override
    public boolean Executa() {
        boolean sair = false;
        
        System.out.println("**************************************");
        System.out.println("*********** MENU PRINCIPAL ***********");
        System.out.println("**************************************");
        
        System.out.println("Se você é um Vendedor, selecione uma das opções abaixo:");
        System.out.println("0 - Sair");
        System.out.println("1 - Menu Produtos");
        System.out.println("2 - Menu Pedidos");
        System.out.println("3 - Menu Clientes");
        
        System.out.println("");
        
        System.out.println("Se você é um Gerente, selecione uma das opções abaixo:");
        System.out.println("0 - Sair");
        System.out.println("1 - Menu Produtos");
        System.out.println("2 - Menu Pedidos");
        System.out.println("3 - Menu Clientes");
        System.out.println("4 - Menu Vendedores");
        
        Scanner scan = new Scanner(System.in);
        
        int opcao = scan.nextInt();
        
        do {            
        
            switch (opcao)
            {
                case 0:
                    System.out.println("Bye!");
                    sair = true;
                    break;
                case 1:
                    Main.estadoConsole = EnumEstadoConsole.CRUD_PRODUTO.getEstadoMaquina();
                    break;
                case 2:
                    Main.estadoConsole = EnumEstadoConsole.CRUD_PEDIDO.getEstadoMaquina();
                    break;
                case 3:
                    Main.estadoConsole = EnumEstadoConsole.CRUD_CLIENTE.getEstadoMaquina();
                    break;
                case 4:
                    Main.estadoConsole = EnumEstadoConsole.CRUD_VENDEDOR.getEstadoMaquina();
                    break;
                default:
                    System.out.println("Essa opção não existe. Tente novamente!");
                    opcao = scan.nextInt();
                    break;
            }
        } while (opcao >= 5);
            
        System.out.println("");
        
        return sair;
    }
}   
