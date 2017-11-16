/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rikke Nielsen
 */

    
    public class DataBase {
    
     private static String  driver ="com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://165.227.129.80:3306/Fogdb2";
    private static String user = "testuser";
    private static String password = "sonA2650";
    private static Connection conn =null;


public static Connection getConnection() throws SQLException{
   
        if(conn == null){
         
              try {
                  Class.forName(driver);
                  conn = DriverManager.getConnection(url,user,password);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
 

    return conn;

}
public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return getConnection().prepareStatement(sql);
    }
}
    

