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
    public static void storeCarport(Carport cp) throws SQLException {
         String carportName = cp.getCarportName();
        int carportWidth = cp.getCarportWidth();
        int carportLength = cp.getCarportLength();
        int carportHeight = cp.getCarportHeight();
        int stolpe_længde = cp.getStolpe_længde();
        int spær_Længde = cp.getSpær_Længde();
        int carport_id = cp.getCarport_id();
        int reglar_længde = cp.getReglar_længde();
        int lægte_længde = cp.getLægte_længde();
        int sternbræt_Længde = cp.getSternBræt_Længde();
        int vindskede_længde = cp.getVindskede_længde();
        int skruer_Antal = cp.getSkruer_Antal();
        int taghældning = cp.getTaghældning();
        int rem_længde = cp.getRem_længde();
        int tag_bredde = cp.getTag_bredde();
        int tag_højde = cp.getTag_højde();
        int tag_udhæng = cp.getTag_udhæng();
        int gavl_bræt_længde = cp.getGavl_bræt_længde();
        int gavl_bræt_højde = cp.getGavl_bræt_højde();
        int gavl_bræt_bredde = cp.getGavl_bræt_bredde();
        double carportPris = cp.getCarportPris();
        double totalPris = cp.getotalPris();
            
        
        String SQL = "INSERT INTO carport(carportName,carportWidth,carportLength,carportHeight,stolpe_længde,spær_Længde,carport_id,reglar_længde,lægte_længde,sternbræt_Længde,vindskede_længde,skruer_Antal,taghældning,totalPris,rem_længde,carportPris,tag_bredde,tag_højde,tag_udhæng,gavl_bræt_længde,gavl_bræt_højde,gavl_bræt_bredde)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(SQL);
        
        ps.setString (1,carportName);
        ps.setInt (2,carportWidth);
        ps.setInt (3,carportLength); 
        ps.setInt (4,carportHeight);
        ps.setInt (5,stolpe_længde);
        ps.setInt (6,spær_Længde);
        ps.setInt (7,carport_id);
        ps.setInt (8,reglar_længde);
        ps.setInt (9,lægte_længde);
        ps.setInt (10,sternbræt_Længde);
        ps.setInt (11,vindskede_længde);
        ps.setInt (12,skruer_Antal);
        ps.setInt (13,taghældning);
        ps.setDouble (14,totalPris);
        ps.setInt (15,rem_længde);
        ps.setDouble (16,carportPris);
        ps.setInt (17,tag_bredde);
        ps.setInt (18,tag_højde);
        ps.setInt (19,tag_udhæng);
        ps.setInt (20,gavl_bræt_længde);
        ps.setInt (21,gavl_bræt_højde);
        ps.setInt (22,gavl_bræt_bredde);
    }
} 
       