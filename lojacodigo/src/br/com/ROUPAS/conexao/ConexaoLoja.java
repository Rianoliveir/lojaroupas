package br.com.ROUPAS.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoLoja {

    //Criando constantes
    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/LOJA";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection ConexaoSQL() throws Exception {

        Connection connection = DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

        return connection;

    }

    public static void main(String[] args) throws Exception {

        Connection connection = ConexaoSQL();

        if (connection != null) {

            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

            connection.close();

        }

    }

}
