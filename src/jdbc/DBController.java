/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rayhan Suryatama R - 1301204435
 */
public class DBController {
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/dbtest";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.out.println("Error with code: " + e);
        }
        return mysqlconfig;
    }
    
}
