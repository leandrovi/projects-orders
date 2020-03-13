/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoConsole;

/**
 *
 * @author 082170032
 */
public enum EnumEstadoConsole {
    
    BEM_VINDO(new EstadoConsoleBemVindo()),
    
    LOGIN(new EstadoConsoleLogin()),
    
    MENU_PRINCIPAL(new EstadoConsoleMenuPrincipal()),
    
    CRUD_PRODUTO(new EstadoConsoleCRUDProduto()),
    
    CRUD_PEDIDO(new EstadoConsoleCRUDPedido()),
    
    CRUD_CLIENTE(new EstadoConsoleCRUDCliente()),
    
    CRUD_VENDEDOR(new EstadoConsoleCRUDVendedor());
 
    private final MaquinaEstadoConsole estadoMaquina;
    
    EnumEstadoConsole(MaquinaEstadoConsole estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }
 
    public MaquinaEstadoConsole getEstadoMaquina() {
        return estadoMaquina;
    }
}
