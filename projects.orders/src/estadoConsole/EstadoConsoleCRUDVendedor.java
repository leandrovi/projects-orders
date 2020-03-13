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
public class EstadoConsoleCRUDVendedor extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean voltarMenu = false;
        
        System.out.println("** CADASTRO DE VENDEDORES **");
        
        do {        
            System.out.println("Selecione uma das opções:");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Listar os Vendedores");
            System.out.println("2 - Criar novo Vendedor");
            System.out.println("3 - Atualizar um Vendedor");
            System.out.println("4 - Apagar um Vendedor");
            
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
                    System.out.println("Listagem de Vendedores");
                    break;
                case 2:
                    // Camada Business: criar pedido
                    System.out.println("Digite o nome do novo Vendedor: ");
                    String novoVendedor = scan.nextLine();
                    
                    System.out.printf("Vendedor '%s' cadastrado com sucesso!%n", novoVendedor);
                    break;
                case 3:
                    // Camada Business: atualizar pedido
                    System.out.print("Digite o nome do Vendedor: ");
                    String nomeVendedor = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Vendedor encontrado! Agora, digite um novo nome: ");
                    String vendedorAtualizado = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.printf("Vendedor atualizado: '%s' -> '%s'%n", nomeVendedor, vendedorAtualizado);                    
                    break;
                case 4:
                    // Camada Business: apagar pedido
                    System.out.print("Digite o nome do Vendedor: ");
                    String vendedorApagar = scan.nextLine();
                    
                    System.out.printf("Vendedor '%s' apagado com sucesso!%n", vendedorApagar);
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
