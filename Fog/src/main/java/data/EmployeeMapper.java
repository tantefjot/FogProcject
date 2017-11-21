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
import logic.Employee;
/**
 *
 * @author Jonas
 */
public class EmployeeMapper {
    

public List<Employee> getAllEmpolyees() throws SQLException{
    List<Employee> emp = new ArrayList<>();
    String sql = "select * from employee";
    PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
      int id = rs.getInt("employee_id");
      String username = rs.getString("employee_username");
      String password = rs.getString("employee_password");
      String fristname = rs.getString("employee_firstname");
      String lastname = rs.getString("employee_lastname");
      emp.add(new Employee(id, username, password, fristname, lastname));
    }
    
    return emp;
    
}


public void creatNewEmpolyee(String username,String password,String firstname,String lastname) throws SQLException{
    String sql = "insert into employee (employee_username,employee_password, employee_firstname,employee_lastname) value(?,?,?,?)";
    PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
     ps.setString(1, username);
    ps.setString(2, password);
    ps.setString(3, firstname);
    ps.setString(4, lastname);
    ps.executeUpdate();
   
    
}

public Employee getSingleEmpolyee(int emp_id) throws SQLException{
   Employee emp = null;
    try {
          String sql = "select * from employee where employee_id = ?";
    PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
      ps.setInt(1, emp_id);
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          int id = rs.getInt("employee_id");
          String username = rs.getString("employee_username");
          String password = rs.getString("empolyee_password");
          String fristname = rs.getString("employee_firstname");
          String lastename = rs.getString("employee_lastname");
         emp = new Employee(id, username, password, fristname, lastename);
      }
     
      
    } catch (Exception e) {
    }
    
     return emp;
  
    
}

public Employee empolyeeLogin(String emp_username,String emp_password) throws SQLException{
 Employee emp = null;
    
    try {
    String sql = "select * from employee where employee_username = ? and employee_password = ?";
    PreparedStatement ps = DataBase.getConnection().prepareStatement(sql);
    ps.setString(1, emp_username);
    ps.setString(2, emp_password);
    ResultSet rs = ps.executeQuery(); 
    if(rs.next()){
     int id = rs.getInt("employee_id");
      String username = rs.getString("employee_username");
      String password = rs.getString("empolyee_password");
      String fristname = rs.getString("employee_firstname");
      String lastename = rs.getString("employee_lastname");
      emp = new Employee(id, username, password, fristname, lastename);
    }
    } catch (Exception e) {
    }
    return  emp;
}


    public static void main(String[] args) throws SQLException {
        EmployeeMapper em = new EmployeeMapper();
       // em.creatNewEmpolyee("Hans123", "h123", "Hans", "Hansen");
       
     
       
//       for(Employee emp : em.getAllEmpolyees()){
//           System.out.println(emp);
//       }
    
      
    
    }

}
