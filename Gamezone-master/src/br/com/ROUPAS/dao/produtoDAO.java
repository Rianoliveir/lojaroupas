/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.dao;

import br.com.ROUPAS.conexao.Conexao;
import br.com.ROUPAS.model.ProdutoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import br.com.ROUPAS.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class produtoDAO {

    public static void Createproduto(ProdutoModel produtoModel) {

        String sql = "INSERT INTO jogo (nome,descricao,preco,estoque) VALUES (?,?,?,?)";
        
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        
        try {

           connection = Conexao.ConexaoSQL();
           preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, produtoModel.getNome());
           preparedStatement.setString(2, produtoModel.getDescricao());
           preparedStatement.setDouble(3,produtoModel.getPreco());
           preparedStatement.setInt(4, produtoModel.getEstoque());
           
           preparedStatement.execute();
            
            
        } catch (Exception e) {
        
            System.out.println(e + "Erro cadastro produto");  
        
        }

    }

}

/**
 *
 * @author rcosta
 */

    

