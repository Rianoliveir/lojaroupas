/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.dao;
import br.com.ROUPAS.model.ClienteModel;
import br.com.ROUPAS.conexao.ConexaoLoja;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class clienteDAO {

    public static void Createcliente(ClienteModel clienteModel) {

        String sql = "INSERT INTO cliente (nome,email,telefone) VALUES (?,?,?)";
        
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        
        try {

           connection = ConexaoLoja.ConexaoSQL();
           preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, clienteModel.getnome());
           preparedStatement.setString(2, clienteModel.getemail());
           preparedStatement.setString(3,clienteModel.gettelefone());
           
           preparedStatement.execute();
            
            
        } catch (Exception e) {
        
            System.out.println(e + "Erro cadastro produto");  
        
        }
    }
}
    


