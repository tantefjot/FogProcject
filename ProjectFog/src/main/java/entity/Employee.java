/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Jonas
 */
public class Employee {
    private int admin_id;
    private String password;
    private  String admin_username;
    private String admin_fristname;
    private String admin_lastname;

    public Employee(int admin_id, String password, String admin_username, String admin_fristname, String admin_lastname) {
        this.admin_id = admin_id;
        this.password = password;
        this.admin_username = admin_username;
        this.admin_fristname = admin_fristname;
        this.admin_lastname = admin_lastname;
    }

    public Employee(String password, String admin_username, String admin_fristname, String admin_lastname) {
        this.password = password;
        this.admin_username = admin_username;
        this.admin_fristname = admin_fristname;
        this.admin_lastname = admin_lastname;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

    public String getAdmin_fristname() {
        return admin_fristname;
    }

    public void setAdmin_fristname(String admin_fristname) {
        this.admin_fristname = admin_fristname;
    }

    public String getAdmin_lastname() {
        return admin_lastname;
    }

    public void setAdmin_lastname(String admin_lastname) {
        this.admin_lastname = admin_lastname;
    }

    @Override
    public String toString() {
        return "Admin{" + "admin_id=" + admin_id + ", password=" + password + ", admin_username=" + admin_username + ", admin_fristname=" + admin_fristname + ", admin_lastname=" + admin_lastname + '}';
    }
    
    
    
    
    
}
