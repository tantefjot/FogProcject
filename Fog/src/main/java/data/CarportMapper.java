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
 * @author Jonas
 */
public class CarportMapper {
    public void creatNewCarport(Carport c){
       
        
 String carport_name = c.getCarport_name();
int antal_Reglar = c.getAntal_Reglar();
 int antal_spær = c.getAntal_spær();
 int antal_rem = c.getAntal_rem();
 int antal_søm = c.getAntal_søm();
 int antal_Stern = c.getAntal_Stern();
int antal_Lægter = c.getAntal_Lægter();
 int antal_Skruer = c.getAntal_Skruer();
int antal_beslag = c.getAntal_beslag();
 int antal_Beklædning = c.getAntal_Beklædning();
 int antal_Vindskede = c.getAntal_Vindskede();
String tagtype = c.getTagtype(); 
 int taghældning = c.getTaghældning(); 
  int product_id = c.getProduct_id();
  int ground_id = c.getGround_id();
 int totalprice = c.getTotalprice();
        
        try {
            String sql = "insert into carport" +
                "(carport_name, antal_Reglar,antal_spær,antal_rem,antal_søm,antal_Ster," +
                "antal_Lægter,antal_Skruer,antal_beslag,antal_Beklædning,antal_Vindskede,tagtype,taghældning," +
                "product_id,ground_id totalprice)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
            ps.setString(1, carport_name);
            ps.setInt(2, antal_Reglar);
            ps.setInt(3, antal_spær);
            ps.setInt(4, antal_rem);
            ps.setInt(5,antal_søm);
            ps.setInt(6, antal_Stern);
            ps.setInt(7, antal_Lægter);
            ps.setInt(8, antal_Skruer);
            ps.setInt(9, antal_beslag);
            ps.setInt(10, antal_Beklædning);
            ps.setInt(11, antal_Vindskede);
            ps.setString(12, tagtype);
            ps.setInt(13,taghældning);
            ps.setInt(14,product_id);
            ps.setInt(15, ground_id);
            ps.setInt(16, totalprice);
            int rowadd = ps.executeUpdate();
            if(rowadd >0){
                System.out.println("carport was add succesfully");
            }
            
        } catch (Exception e) {
        }
        
        

    }
    
    public List<Carport> getAllCarports() throws SQLException{
        List<Carport> c = new ArrayList<>();
        String sql = "select * from carport";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
  int carport_id = rs.getInt("carport_id");
  String carport_name = rs.getString("carport_name");
 int antal_Reglar = rs.getInt("antal_Reglar");
 int antal_spær = rs.getInt("antal_spær");
  int antal_rem = rs.getInt("antal_rem");
 int antal_søm = rs.getInt("antal_søm");
 int antal_Stern =  rs.getInt("antal_Stern");
 int antal_Lægter = rs.getInt("antal_Lægter");
  int antal_Skruer = rs.getInt("antal_Skruer");
 int antal_beslag = rs.getInt("antal_beslag");
 int antal_Beklædning = rs.getInt("antal_Beklædning");
 int antal_Vindskede = rs.getInt("antal_Vindskede");
 String tagtype = rs.getString("tagtype"); 
 int taghældning = rs.getInt("taghældning"); 
 int product_id = rs.getInt("product_id");
 int ground_id = rs.getInt("ground_id ");
 int totalprice = rs.getInt("totalprice");
 c.add(new Carport(carport_id, carport_name, antal_Reglar, antal_spær, antal_rem, antal_søm, antal_Stern, antal_Lægter, antal_Skruer, antal_beslag, antal_Beklædning, antal_Vindskede, tagtype, taghældning, product_id, ground_id, totalprice));
        
        }
        return c;
    }
}
