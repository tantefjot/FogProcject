/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import logic.Product;

/**
 *
 * @author Rikke Nielsen
 */
public class ProductMapper {
    
    public void createProduct(int product_id,String productName,double productPrice,int productLength,int productHeigth, int productWidth) throws SQLException{
       
         
            String SQL ="insert into products (product_name,prodduct_length,product_heigth,product_width,product_price,product_id)"
                    + " values (?,?,?,?,?,?)";
               PreparedStatement ps = data.DataBase.getConnection().prepareStatement(SQL);
            //PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            
            ps.setString(1,productName);
            ps.setInt(2, productLength);
            ps.setInt(3, product_id);
            ps.setInt(4, productWidth);
            ps.setInt(5, productHeigth);
            ps.setDouble(6,productPrice);
            ps.executeUpdate();
                
            
            
            
            
            
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
    
    
    
    public List<Product> getAllproducts() throws SQLException{
        List<Product> product = new ArrayList<>();
        String sql = "select * from products";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             int product_id = rs.getInt("product_id");
             String product_name = rs.getString("product_name");
             double product_Price = rs.getDouble("product_price");
             int productLength = rs.getInt("prodduct_length");
             int productHeigth = rs.getInt("product_heigth");
             int productWidth = rs.getInt("product_width");
             product.add(new Product(product_id, product_name, product_Price, productLength, productHeigth, productWidth));
         }
        
        return product;
    }
    
    
    public Product getSingleproduct(int id) throws SQLException{
   
 
      
        
             Product product = null;
        try {
            Connection conn = new data.DataBase().getConnection();
            String sql = "select * from products where product_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int product_id = rs.getInt("product_id");
                String product_name = rs.getString("product_name");
                double product_Price = rs.getDouble("product_Price");
                int product_length = rs.getInt("prodduct_length");
                int product_heigth = rs.getInt("product_heigth");
                int product_width = rs.getInt("product_width");
             product = new Product(product_id, product_name, product_Price, product_length, product_heigth, product_width);
            }
        } catch (SQLException sq) {
            sq.printStackTrace();
        }
        return product;
    }
    
    public static void main(String[] args) throws SQLException {
        ProductMapper pm = new ProductMapper();
        Product pro;
        
        
      pm.createProduct(12, "dette product", 11.5, 120, 120, 150);


//for(Product product : pm.getAllproducts()){
//    System.out.println(product);
//}


       // System.out.println(  pm.getSingleproduct(11));
        
    }


}
    
    



