/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import logic.Users;
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
public class Usermapper {

    public void creatNewUser(Users u) {

 String user_name = u.getUser_name();
 String user_password = u.getUser_password();
  String user_email = u.getUser_email();
    String firstName = u.getFirstName();
  String lastName = u.getLastName();
  String city = u.getCity();
   String zipCode = u.getZipCode();
  String phone = u.getPhone();
   String address = u.getAddress();
   
   
        try {
            String sql = "INSERT INTO users (userName, userPassword, email,fristname,lastname,city,zipcode,phone,address) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
            
            ps.setString(1, user_name);
            ps.setString(2, user_password);
            ps.setString(3, user_email);
            ps.setString(4, firstName);
            ps.setString(5, lastName);
            ps.setString(6, city);
            ps.setString(7, zipCode);
            ps.setString(8, phone);
            ps.setString(9, address);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Users> getAllUsers() throws SQLException {
        List<Users> users = new ArrayList<>();
        String sql = "select * from users";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int user_id = rs.getInt("user_id");
            String user_name = rs.getString("userName");
            String user_password = rs.getString("userPassword");
            String user_email = rs.getString("email");
            String firstName = rs.getString("fristname");
            String lastName = rs.getString("lastname");
         
            String city = rs.getString("city");
            String zipCode = rs.getString("zipcode");
            String phone = rs.getString("phone");
            String address = rs.getString("address");
            users.add(new Users(user_id, user_name, user_password, user_email, firstName, lastName, city, zipCode, phone, address));
        }
        return users;
    }

    public Users getSingelUser(int id) {

        Users use = null;
        try {
            Connection conn = new data.DataBase().getConnection();
            String sql = "select * from users where user_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int user_id = rs.getInt("user_id");
                String user_name = rs.getString("userName");
                String user_password = rs.getString("userPassword");
                String user_email = rs.getString("email");
                String firstName = rs.getString("fristname");
                String lastName = rs.getString("lastname");
                String city = rs.getString("city");
                String zipCode = rs.getString("zipcode");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                use = new Users(user_id, user_name, user_password, user_email, firstName, lastName, city, zipCode, phone, address);
            }
        } catch (SQLException sq) {
            sq.printStackTrace();
        }
        return use;
    }

    public Users userLogin(String username, String userpassword) {
        Users user = null;
        try {
            Connection conn = new data.DataBase().getConnection();
            String sql = "SELECT * FROM users WHERE user_name = ? AND user_password = ?";
            PreparedStatement pstmt = conn.prepareCall(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, userpassword);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int user_id = rs.getInt("user_id");
                String user_name = rs.getString("userName");
                String user_password = rs.getString("user_password");
                String user_email = rs.getString("email");
               String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
           
                String city = rs.getString("city");
                String zipCode = rs.getString("zipcode");
                String phone = rs.getString("phone");
                String address = rs.getString("address");

                user = new Users(user_id, user_name, user_password, user_email, firstName, lastName, city, zipCode, phone, address);
            }

        } catch (SQLException sq) {
            sq.printStackTrace();
        }
        return user;
    }
    
    
    public static void main(String[] args) {
        Usermapper um = new Usermapper();
        
       Users u = new Users("hans", "hans123", "hans@gmail.com", "hans", "hansen", "blåovre", "2647", "23456789", "bålovrevej 17");

     um.creatNewUser(u);
    }

}
