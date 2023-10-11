/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.dao;
import br.com.ROUPAS.conexao.Conexao;
import br.com.ROUPAS.model.ProdutoModel;
import br.com.ROUPAS.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class clienteDAO {

    public static void Createproduto(ProdutoModel produtoModel) {

        String sql = "INSERT INTO jogo (nome,email,telefone) VALUES (?,?,?)";
        
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        
        try {

           connection = Conexao.ConexaoSQL();
           preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, ClienteModel.getNome());
           preparedStatement.setString(2, ClienteModel.getemail());
           preparedStatement.setString(3,ClienteModel.gettelefone());
           
           preparedStatement.execute();
            
            
        } catch (Exception e) {
        
            System.out.println(e + "Erro cadastro produto");  
        
        }

    }

}
/**
 *
 * @author rcosta

