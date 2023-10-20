/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ROUPAS.dao;
import br.com.ROUPAS.model.ProdutoModel;
import br.com.ROUPAS.conexao.ConexaoLoja;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class produtoDAO {

    public  void Createprodutos(ProdutoModel produtoModel) {

        String sql = "INSERT INTO produto (nome,descricao,preco,estoque) VALUES (?,?,?,?)";
        
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        
        try {

           connection = ConexaoLoja.ConexaoSQL();
           preparedStatement = connection.prepareStatement(sql);
           
           preparedStatement.setString(1, produtoModel.getNome());
           preparedStatement.setString(2, produtoModel.getDescricao());
           preparedStatement.setDouble(3,produtoModel.getPreco());
           preparedStatement.setInt(4, produtoModel.getEstoque());
           
           preparedStatement.execute();
            
            
        } catch (Exception e) {
        
            System.out.println(e + "Erro cadastro produto " + e);  
        
        }

    }



    public List<ProdutoModel> Showproduto() {

        String sql = "SELECT * FROM produto";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ProdutoModel> Produto = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = ConexaoLoja.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ProdutoModel produto = new ProdutoModel();

                produto.setId_produto(resultSet.getInt("id_produto"));
                produto.setNome(resultSet.getString("nome"));
                produto.setDescricao(resultSet.getString("descricao"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setEstoque(resultSet.getInt("estoque"));

                resultSet.close();
                
             Produto.add(produto);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return Produto;
    }

    public void Updateproduto(ProdutoModel produtoModel) {

        String sql = "UPDATE produto SET nome = ?,descricao = ?,preco= ?,estoque=? WHERE id_produto=?";

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConexaoLoja.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setString(1, produtoModel.getNome());
            ps.setString(3, produtoModel.getDescricao());
            ps.setDouble(4, produtoModel.getPreco());
            ps.setInt(5, produtoModel.getEstoque());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro:  " + e);
        }
    }

    public void Deleteproduto(int id_produto) throws SQLException {

        String sql = "DELETE FROM produto WHERE id_produto = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoLoja.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_produto);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }

    }

}


/**
 *
 * @author rcosta
 */

    

