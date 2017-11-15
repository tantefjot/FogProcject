/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import logic.Product;

/**
 *
 * @author Rikke Nielsen
 */
public class ProductMapper {
    
    public static void createProduct(Product product) throws SQLException{
       
            Connection con = Connector.getconnetion();
            String SQL ="insert into products (productName,productlength,productheigth,productwidth,productprice)"
                    + " values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            
            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getProductLength());
    
            
            
            
            
            
//    public static void createUser( User user ) throws LoginSampleException {
//        try {
//            Connection con = Connector.getconnection();
//            String SQL = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";
//            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
//            ps.setString( 1, user.getEmail() );
//            ps.setString( 2, user.getPassword() );
//            ps.setString( 3, user.getRole() );
//            ps.executeUpdate();
//            ResultSet ids = ps.getGeneratedKeys();
//            ids.next();
//            int userID = ids.getInt( 1 );
//            user.setUserID( userID );
//        } catch ( SQLException | ClassNotFoundException ex ) {
//            throw new LoginSampleException( ex.getMessage() );
//        }
//    }
//
//    public static User login( String email, String password ) throws LoginSampleException {
//        try {
//            Connection con = Connector.getconnection();
//            String SQL = "SELECT userID, role FROM users "
//                    + "WHERE email=? AND password=?";
//            PreparedStatement ps = con.prepareStatement( SQL );
//            ps.setString( 1, email );
//            ps.setString( 2, password );
//            ResultSet rs = ps.executeQuery();
//            if ( rs.next() ) {
//                String role = rs.getString( "role" );
//                int userID = rs.getInt( "userID" );
//                User user = new User( email, password, role );
//                user.setUserID( userID );
//                return user;
//            } else {
//                throw new LoginSampleException( "Could not validate user" );
//            }
//        } catch ( ClassNotFoundException | SQLException ex ) {
//            throw new LoginSampleException(ex.getMessage());
//        }
//    }

}

}
