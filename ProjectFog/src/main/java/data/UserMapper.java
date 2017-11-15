/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonas
 */

/**
 * denne metohde returner en list af user
 *
 */
public class UserMapper {

    public List<User> getAllUsers() throws SQLException {
        //laver en ny List 
        List<User> user = new ArrayList<>();
        //sql statement der skal bruges i databasen
        String sql = "select * from users";
        //laver et PreparedStatment og opretter fobindes til databasen 
        PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
        // laver et resulset 
        ResultSet rs = ps.executeQuery();
        try {
            //looper igemmen resultsetet 
            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                String user_name = rs.getString("user_name");
                String user_password = rs.getString("user_password");
                String user_email = rs.getString("user_email");
                String user_firstname = rs.getString("user_firstname");
                String user_lastname = rs.getString("user_lastname");
                // adder
                user.add(new User(user_id, user_lastname, user_password, user_email, user_firstname, user_lastname));
            }
            // hvis det lykkedes return listen 
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // hvis det går galt 
        return null;

    }

    //oprette en new user
    public void createNewUser(int user_id,String user_name, String user_password,String user_email, String user_firstname, String user_lastname) {
       
   
        
        try {
            String sql = "insert into users (user_id,user_name, user_password, user_email,user_firstname,user_lastname) values(?,?,?,?,?,?)";
            PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setString(2, user_name);
            ps.setString(3,user_password);
            ps.setString(4, user_email);
            ps.setString(5, user_firstname);
            ps.setString(6, user_lastname);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    // tjeke om user findes 
     public User userLogin(String username, String userpassword) throws SQLException{
        User use = null;
         String sql = "SELECT * FROM users WHERE user_name = ? AND user_password = ?";
         PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
        ps.setString(1, username);
        ps.setString(2, userpassword);
         try {
  
         if(rs.next()){
          int user_id = rs.getInt("user_id");
          String user_name = rs.getString("user_name");
          String user_password = rs.getString("user_password");
          String user_email = rs.getString("user_email");
          String user_firstname = rs.getString("user_firstname");
          String user_lastname = rs.getString("user_lastname"); 
           
         use = new User(user_id, user_name, user_password, user_email, user_firstname, user_lastname);
         
         }  
         } catch (Exception e) {
         }
       
       return use;
     }
    //reunere en user 
    public User getUser(int user_id) throws SQLException {
        User use = null;
        try {
            String sql = "select * from users where user_id = ?";
            PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
           
            ps.setInt(1, user_id);
             ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String user_password = rs.getString("user_password");
                String user_name = rs.getString("user_name");
                String user_email = rs.getString("user_email");
                String user_firstname = rs.getString("user_firstname");
                String user_lastname = rs.getString("user_lastname");
                use = new User(user_name, user_password, user_email, user_firstname, user_lastname);

            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return use;
    }

    public static void main(String[] args) throws SQLException {
        UserMapper um = new UserMapper();
        User use;

//        for (User users : um.getAllUsers()) {
//            System.out.println(users);
//        }

//   um.createNewUser(2,"Jonas","Jonas1234", "jonas@mail.com", "Jonas", "Andersen");
        System.out.println(um.getUser(1));
    }
}
