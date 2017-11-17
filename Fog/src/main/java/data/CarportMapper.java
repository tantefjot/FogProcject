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

    public void creatNewCarport(Carport c) {

        String carportName = c.getCarportName();
        int carportWidth = c.getCarportWidth();
        int carportLength = c.getCarportLength();
        int carportHeight = c.getCarportWidth();
        int stolpe_højde = c.getStolpe_højde();
        int spær_Længde = c.getSpær_Længde();
        int reglar_længde = c.getReglar_længde();
        int lægte_længde = c.getLægte_længde();
        int sternBrædt_Længde = c.getSternBrædt_Længde();
        int Vindskede_længde = c.getVindskede_længde();
        int Rem = c.getRem();
        int skruer = c.getSkruer();
        int taghældning = c.getTaghældning();
        double totalprice = c.getTotalprice();
        int rem_længde = c.getRem_længde();
        int tag_bredde = c.getTag_bredde();
        int tag_højde = c.getTag_højde();
        int tag_udhæng = c.getTag_udhæng();
        int gavl_bræt_længde = c.getGavl_bræt_længde();
        int gavl_bræt_højde = c.getGavl_bræt_højde();
        int gavl_bræt_bredde = c.getGavl_bræt_bredde();
        int product_id  = c.getProduct_id();

        try {
            String sql = "insert into carport"
                    + "(carport_name,carportWidth,carportLength,carportHeight,stolpe_højde,spær_Længde,reglar_længde, lægte_længde ,"
                    + "sternBrædt_Længde,Vindskede_længde, Rem,skruer,taghældning, rem_længde,tag_bredde,tag_højde,tag_udhæng,"
                    + "gavl_bræt_længde ,gavl_bræt_højde,gavl_bræt_bredde,product_id, totalprice)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?;?)";
            PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
            ps.setString(1, carportName);
            ps.setInt(2, carportWidth);
            ps.setInt(3, carportLength);
            ps.setInt(4,  carportHeight);
            ps.setInt(5, stolpe_højde);
            ps.setInt(6,  spær_Længde);
            ps.setInt(7, reglar_længde);
            ps.setInt(8, lægte_længde);
            ps.setInt(9, sternBrædt_Længde);
            ps.setInt(10, Vindskede_længde);
            ps.setInt(11, Rem );
            ps.setInt(12, skruer);
            ps.setInt(13, taghældning);
            ps.setDouble(14, totalprice);
            ps.setInt(15, rem_længde);
            ps.setInt(16, tag_bredde);
            ps.setInt(17, tag_højde);
             ps.setInt(18, tag_udhæng);
              ps.setInt(19, gavl_bræt_længde);
              ps.setInt(20, gavl_bræt_højde );
                ps.setInt(21, gavl_bræt_bredde);
                ps.setInt(22, product_id);
            int rowadd = ps.executeUpdate();
            if (rowadd > 0) {
                System.out.println("carport was add succesfully");
            }

        } catch (Exception e) {
        }

    }

    public List<Carport> getAllCarports() throws SQLException {
        List<Carport> c = new ArrayList<>();
        String sql = "select * from carport";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String carportName = rs.getString("carport_name");
            int carportWidth = rs.getInt("carportWidth");
            int carportLength = rs.getInt("carporLength");
            int carportHeight = rs.getInt("carportHeight");
            int stolpe_højde = rs.getInt("stolpe_højde");
            int spær_Længde = rs.getInt("spær_Længde");
            int carport_id = rs.getInt("carport_id");
            int reglar_længde = rs.getInt("reglar_længde");
            int lægte_længde = rs.getInt("lægte_længde");
            int sternBrædt_Længde = rs.getInt("sternBrædt");
            int Vindskede_længde = rs.getInt("Vindskede_længde");
            int Rem = rs.getInt("Rem");
            int skruer = rs.getInt("skruer");
            int taghældning = rs.getInt("taghældning");
            double totalprice = rs.getDouble("totalprice");
            int rem_længde = rs.getInt("rem_længde");
            int tag_bredde = rs.getInt("tag_bredde");
            int tag_højde = rs.getInt("taghøjde");
            int tag_udhæng = rs.getInt("tag_udhæng");
            int gavl_bræt_længde = rs.getInt("gavl_bræt_længde");
            int gavl_bræt_højde = rs.getInt("gavl_bræt_længde");
            int gavl_bræt_bredde = rs.getInt("gavl_bræt_bredde");
            int product_id = rs.getInt("product_id ");
            c.add(new Carport(carportName, carportWidth, carportLength, carportHeight, stolpe_højde, spær_Længde, carport_id, reglar_længde, lægte_længde, sternBrædt_Længde, Vindskede_længde, Rem, skruer, taghældning, totalprice, rem_længde, tag_bredde, tag_højde, tag_udhæng, gavl_bræt_længde, gavl_bræt_højde, gavl_bræt_bredde,product_id));
        }
        return c;
    }

    public void deleteCarport(int id) throws SQLException {
        String sql = "DELETE FROM Carport WHERE carportID = ? " + id + ";";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
        ps.execute();
    }

    public static void main(String[] args) {
        CarportMapper cm = new CarportMapper();

    }

}
