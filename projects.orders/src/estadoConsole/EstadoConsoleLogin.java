/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;

// Imports packages Java
import java.util.Scanner;

// Imports my packages
import crud.Main;
import acesso.Usuario;

/**
 *
 * @author 082170032
 */
public class EstadoConsoleLogin extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        Usuario user = new Usuario();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário");        
        user.setLogin(scan.nextLine());
        
        System.out.println("Digite sua senha");
        user.setSenha(scan.nextLine());
        
        // TODO - Validação de senha
//        Acesso acesso = new Acesso();
//        boolean senhaValida = acesso.validaUsuario(user);
        
//        if (senhaValida)
//            Main.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
//        else {
//            System.out.println("Dados inválidos!");
//        }  
        
        return sair;
    }
}
