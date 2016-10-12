/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.management.system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wohhie
 */
public class DB {
    
    private static String url = "jdbc:mysql://localhost/inventory_management";
    private static String drivername = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "";
    private static Connection conn;
    
    
    public static Connection ConnectDB(){
        try{
            Class.forName(drivername);
            try{
                conn = (Connection) DriverManager.getConnection(url, username, password);
            }catch(SQLException ex){
                System.out.println("Faild to create the connection.");
            }
        }catch(Exception ex){
            System.out.println("Driver not found.");
        }
        
        return conn;
    }
    
}
