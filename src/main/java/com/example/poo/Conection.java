package com.example.poo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/aulajpa?useTimezone=true&serverTimezone=UTC&useSSL=false", "root", "");
        } catch (SQLException erro){
            throw new RuntimeException(erro);         }
    }

}



