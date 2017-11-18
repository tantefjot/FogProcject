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
import logic.Carport;

/**
 *
 * @author Rikke Nielsen
 */
public class CarportMapper {
    public static List<Carport> getCarports(String SQL) throws SQLException
    {
      
            PreparedStatement ps = data.DataBase.getConnection().prepareStatement(SQL);{
        
    }
        return null;
    }
    public static void storeCarport(Carport cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
            
} }       