/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.produto;

import produto.Produto;
import basis.Entidade;
import dao.basis.DAO;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author leandro
 */
public class ProdutoTextoDAO extends DAO {
   
    private File file = new File(".." + File.separator + "files" + File.separator + "products.txt");
    
    public ProdutoTextoDAO()
    { 
        super(Produto.class);
    }
    
    @Override
    public Entidade seleciona(int id) {
        // Não há retorno por id
        return null;
    }

    @Override
    public Entidade localiza(String codigo) throws SQLException  {
        return null;
    }
    
    @Override
    public ArrayList<Entidade> lista() throws SQLException {
        ArrayList<Entidade> listaProduto = new ArrayList<Entidade>();
        
        Scanner sc = null;
        
        try {
            sc = new Scanner(file);
            Produto produto = new Produto();

            while (sc.hasNextLine()) {
                produto.setName(sc.nextLine());

                listaProduto.add(produto);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        
        return listaProduto;
    }
    
    @Override
    public boolean adiciona(String codigo) throws SQLException {
        return true;
    }
    
    @Override
    public boolean remove(String codigo) throws SQLException {
        return true;
    }
}
