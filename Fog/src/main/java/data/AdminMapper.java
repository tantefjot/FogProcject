/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import logic.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Jonas
 */
public class AdminMapper {
    public Admin login(String username, String Password){
       Admin admin = null;
        
        try {
          String sql = "select * from admin where admin_username = ? and admin_password = ?";
         PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, Password);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
           int id = rs.getInt("admin_id");
           String admin_username = rs.getString("admin_username");
           String admin_password = rs.getString("admin_password");
           admin = new Admin(id, admin_username, admin_password);
        }
        } catch (Exception e) {
        }
        return admin;
    }
    
   
    
    
}
