package br.com.privateti.dao;

import java.sql.*;


public class ModuloConexao {

    //conecta no banco
    public static Connection conector() {

        Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "alexandre";
        String senha = "private";
        String url = "jdbc:mysql://localhost:3306/sistemaos?useTimezone=true&serverTimezone=UTC";

        try {

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;

        } catch (Exception e) {

            System.out.println("ocorreu um erro ao tentar conectar ao banco.");
            System.out.println(e);
            return null;

        }

    }

}
