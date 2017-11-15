/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import entity.Order;
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
public class OrderMapper {
// public void addOrder( String rooftype, double width, double length, double heigth, int user_id) throws SQLException{
//     try {
//         String sql = "insert into orders(rooftype,width,length,height, user_id) values(?,?,?,?,?)";
//         PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
//         
//         ps.setString(1, rooftype);
//         ps.setDouble(2, width);
//         ps.setDouble(3, length);
//         ps.setDouble(4, heigth);
//         ps.setInt(5, user_id);
//         ps.executeUpdate();
//     } catch (Exception ex) {
//       ex.printStackTrace();
//     
//     }
//     
//     
//     
//     
// 
// }
// 
// public List<Order> getAllorders() throws SQLException{
//     List<Order> orders = new ArrayList<>();
//     String sql = "select * from orders";
//     PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
//     ResultSet rs = ps.executeQuery();
//     try {
//         while(rs.next()){
//          int order_id = rs.getInt("order_id");
//          double width = rs.getDouble("width");
//          double length = rs.getDouble("length");
//          double heigth = rs.getDouble("height");
//          String rooftype = rs.getString("rooftype");
//          int user_id = rs.getInt("user_id");
//          orders.add(new Order(order_id, rooftype, width, length, heigth, user_id));
//         }
//         return orders;
//     } catch (Exception e) {
//     }
//     return null;
// }
// 
// 
// 
// public List<Order> getOrderByUser_id(int orderid){
////    Order order = null;
//   List<Order> userorder = new ArrayList<>();
//   
//     
//    try {
//         String sql = "select * from orders where order_id = ?";
//         PreparedStatement ps = db.DataBase.getConnection().prepareStatement(sql);
//         ps.setInt(1, orderid);
//         ResultSet rs = ps.executeQuery();
//         while(rs.next()){
//             int order_id = rs.getInt("order_id");
//             double width = rs.getDouble("width");
//             double length = rs.getDouble("length");
//             double heigth = rs.getDouble("height");
//             String rooftype = rs.getString("rooftype");
//             int user_id = rs.getInt("user_id");
//       userorder.add(new Order(order_id, rooftype, width, length, heigth, user_id));
//         }
//         return userorder;
//         
//     } catch (Exception ex) {
//     
//     ex.printStackTrace();
//     }
//     return null;
// }
// 
// 
//    public static void main(String[] args) throws SQLException {
//        OrderMapper om = new OrderMapper();
////        om.addOrder("fladt tag", 2.30, 3.00, 3.50, 1);
//      Order o = new Order();
//      
//   for(Order orders : om.getOrderByUser_id(1)){
//       System.out.println(orders);
//   }
//
//    
//    }
}
