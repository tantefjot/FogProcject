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
    
    public static void createProduct(int product_id, String productName, double productPrice, int productLength, int productHeigth, int productWidth) throws SQLException{
       
            Connection con = Connector.getconnetion();
            String SQL ="insert into products (productName,productlength,productheigth,productwidth,productprice)"
                    + " values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            
            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getProductLength());
    
            
            
            
            
    }

}
