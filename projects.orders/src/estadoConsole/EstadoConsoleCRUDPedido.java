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
public class EstadoConsoleCRUDPedido extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean voltarMenu = false;
        
        System.out.println("** CADASTRO DE PEDIDOS **");
        
        do {        
            System.out.println("Selecione uma das opções:");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Listar os Pedidos");
            System.out.println("2 - Criar novo Pedido");
            System.out.println("3 - Atualizar um Pedido");
            System.out.println("4 - Apagar um Pedido");
            
            System.out.println("");

            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao)
            {
                case 0:
                    Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
                    return false;
                case 1:
                    // Camada Business: lista pedidos
                    System.out.println("Listagem de Pedidos");
                    break;
                case 2:
                    // Camada Business: criar pedido
                    System.out.println("Digite o nome do novo Pedido: ");
                    String novoPedido = scan.nextLine();
                    
                    System.out.printf("Pedido '%s' cadastrado com sucesso!%n", novoPedido);
                    break;
                case 3:
                    // Camada Business: atualizar pedido
                    System.out.print("Digite o nome do Pedido: ");
                    String nomePedido = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Pedido encontrado! Agora, digite um novo nome: ");
                    String pedidoAtualizado = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.printf("Pedido atualizado: '%s' -> '%s'%n", nomePedido, pedidoAtualizado);                    
                    break;
                case 4:
                    // Camada Business: apagar pedido
                    System.out.print("Digite o nome do Pedido: ");
                    String pedidoApagar = scan.nextLine();
                    
                    System.out.printf("Pedido '%s' apagado com sucesso!%n", pedidoApagar);
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
