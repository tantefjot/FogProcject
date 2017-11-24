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
import logic.Design;
/**
 *
 * @author Jonas
 */
public class DesignMapper {
   public List<Design> getAllDesigns() throws SQLException{
       List<Design> design = new ArrayList<>();
       String sql ="select * from design";
       PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       while(rs.next()){
        int id = rs.getInt("design_id");
        double length = rs.getDouble("length");
        double width = rs.getDouble("width");
        double  height = rs.getDouble("height");
        String name = rs.getString("designName");
        int user_id = rs.getInt("user_id");
        design.add(new Design(id, length, width, height, name, user_id));
        
       }
       
       return design;
   }
   



public Design getSignleDesign(int id){
    Design design = null;
    try {
        String sql = "select * from design where design_id = ?";
        PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
          ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        int design_id = rs.getInt("design_id");
        double length = rs.getDouble("length");
        double width = rs.getDouble("width");
        double  height = rs.getDouble("height");
        String name = rs.getString("designName");
        int user_id = rs.getInt("user_id");
        design = new Design(design_id, length, width, height, name, user_id);
        }
    } catch (Exception e) {
    }
    return design;
}


public Design getDesignbyuserid(int id){
    Design design = null;
    try {
        String sql = "select * from design where user_id = ?";
        PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
          int design_id = rs.getInt("design_id");
          double length = rs.getDouble("length");
          double width = rs.getDouble("width");
          double height = rs.getDouble("height");
          String name = rs.getString("designName");
          int user_id = rs.getInt("user_id");
          design = new Design(design_id, length, width, height, name, user_id);
        }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return design;
}


public void creatNewDesign( double length, double width, double  height, String name, int user_id) throws SQLException{
    String sql = "insert into design (length,width,height,designName,user_id) values(?,?,?,?,?)";
    PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
    ps.setDouble(1, length);
    ps.setDouble(2, width);
    ps.setDouble(3, height);
    ps.setString(4, name);
    ps.setInt(5, user_id);
    ps.executeUpdate();
}


 public void deleteDesign(int id) throws SQLException {
        String sql = "DELETE FROM design WHERE design_id = ? " + id + ";";
        PreparedStatement ps = data.DataBase.getConnection().prepareStatement(sql);
        ps.execute();
    }

    public static void main(String[] args) throws SQLException {
        DesignMapper dm = new DesignMapper();
//        
//      for(Design design : dm.getAllDesigns()){
//          System.out.println(design);
//      }

        System.out.println(dm.getDesignbyuserid(1));
    }
}
