/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hellojasper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FranciscoRomeroGuill
 */
public class JdbcUtil {

    static private Connection con = null;

    static {
        String url = "jdbc:mysql://localhost:3306/pokedex";
        String user = "root";
        String password = "jumaca";
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Satisfactoria");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    static Connection getConnection() {
        return con;
    }
}
