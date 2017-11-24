/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Rikke Nielsen
 */
public class Admin {
    
    private int id;
    private String usereName;
     private String password ;

    public Admin(int id, String usereName, String password) {
        this.id = id;
        this.usereName = usereName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsereName() {
        return usereName;
    }

    public void setUsereName(String usereName) {
        this.usereName = usereName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", usereName=" + usereName + ", password=" + password + '}';
    }

     
    
    
    
}
