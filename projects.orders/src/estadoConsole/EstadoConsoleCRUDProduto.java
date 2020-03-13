/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;

import crud.Main;
import java.util.Scanner;
import produto.Produto;

import produtos.BusinessProduto;

/**
 *
 * @author 082170032
 */
public class EstadoConsoleCRUDProduto extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean voltarMenu = true;
        BusinessProduto businessProduct = new BusinessProduto();
        
        System.out.println("** CADASTRO DE PRODUTOS **");
        
        do {        
            System.out.println("Selecione uma das opções:");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.println("1 - Listar os Produtos");
            System.out.println("2 - Criar novo Produto");
            System.out.println("3 - Atualizar um Produto");
            System.out.println("4 - Apagar um Produto");
            
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
                    // Camada Business: lista produtos
                    System.out.println(businessProduct.listarProdutos());
                    break;
                case 2:
                    // Camada Business: criar produto
                    System.out.println("Digite o nome do novo produto: ");
                    String novoProduto = scan.nextLine();
                    
                    System.out.printf("Produto '%s' cadastrado com sucesso!%n", novoProduto);
                    break;
                case 3:
                    // Camada Business: atualizar produto
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.print("Produto encontrado! Agora, digite um novo nome: ");
                    String produtoAtualizado = scan.nextLine();
                    
                    System.out.println("");
                    
                    System.out.printf("Produto atualizado: '%s' -> '%s'%n", nomeProduto, produtoAtualizado);                    
                    break;
                case 4:
                    // Camada Business: apagar produto
                    System.out.print("Digite o nome do produto: ");
                    String produtoApagar = scan.nextLine();
                    
                    System.out.printf("Produto '%s' apagado com sucesso!%n", produtoApagar);
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
