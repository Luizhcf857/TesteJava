package com.exemplo.app;

import java.sql.*;

public class App 
{
    public static void cadastar(String nome)
    {
        Connection conn = Conexao.conectar();

        if(conn != null){
            try{

                String sql = "INSERT INTO usuarios (nome) VALUES (?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, "Luiz");
                stmt.executeUpdate();

            }catch(SQLException e){
                System.err.println("Falha ao inserir usuario "+ e.getMessage());
            }

        }

    }

    public static void main(String [] args){
        cadastar("Luiz");

    }

}
