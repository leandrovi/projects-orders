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
public class EstadoConsoleCRUDCliente extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean voltarMenu = false;
        
        System.out.println("** CADASTRO DE CLIENTES **");
        
        do {        
            System.out.println("Selecione uma das opções:");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Listar os Clientes");
            System.out.println("2 - Criar novo Cliente");
            System.out.println("3 - Atualizar um Cliente");
            System.out.println("4 - Apagar um Cliente");
            
            System.out.println("");

            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao)
            {
                case 0:
                    Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
                    break;
                case 1:
                    // Camada Business: lista pedidos
                    System.out.println("Listagem de Clientes");
                    break;
                case 2:
                    // Camada Business: criar pedido
                    System.out.println("Digite o nome do novo Cliente: ");
                    String novoCliente = scan.nextLine();
                    
                    System.out.printf("Cliente '%s' cadastrado com sucesso!%n", novoCliente);
                    break;
                case 3:
                    // Camada Business: atualizar pedido
                    System.out.print("Digite o nome do Cliente: ");
                    String nomeCliente = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Cliente encontrado! Agora, digite um novo nome: ");
                    String clienteAtualizado = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.printf("Cliente atualizado: '%s' -> '%s'%n", nomeCliente, clienteAtualizado);                    
                    break;
                case 4:
                    // Camada Business: apagar pedido
                    System.out.print("Digite o nome do Cliente: ");
                    String clienteApagar = scan.nextLine();
                    
                    System.out.printf("Cliente '%s' apagado com sucesso!%n", clienteApagar);
                    break;
            }
            
            System.out.println("");
                        
            System.out.println("Deseja ver as opções novamente?");
            System.out.println("0 - Não");
            System.out.println("1 - Sim");

            int opcao2 = scan.nextInt();

            switch (opcao2)
            {
                case 0:
                    Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
                    return false;
                case 1:
                    break;
            } 
           
        } while (voltarMenu);
            
        System.out.println("");
        
        return false;
    }
}
