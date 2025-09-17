package com.exemplo.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static final String URL = "jdbc:mysql://localhost:3306/gerenciamento_cli";
    public static final String USER = "root";
    public static final String PASSWORD = "1234";

    public static Connection conectar(){

        try{    
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;

        }catch(SQLException e){
            System.err.println("Falha na conexão "+ e.getMessage());
            return null;
        }


    }
}
