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
public class Admin {
    private int superadmin_id;
    private String superadmin_username;
    private String superadmin_password;

    public Admin(int superadmin_id, String superadmin_username, String superadmin_password) {
        this.superadmin_id = superadmin_id;
        this.superadmin_username = superadmin_username;
        this.superadmin_password = superadmin_password;
    }

 public int getSuperadmin_id() {
        return superadmin_id;
    }

    public void setSuperadmin_id(int superadmin_id) {
        this.superadmin_id = superadmin_id;
    }

    public String getSuperadmin_username() {
        return superadmin_username;
    }

    public void setSuperadmin_username(String superadmin_username) {
        this.superadmin_username = superadmin_username;
    }

    public String getSuperadmin_password() {
        return superadmin_password;
    }

    public void setSuperadmin_password(String superadmin_password) {
        this.superadmin_password = superadmin_password;
    }

    @Override
    public String toString() {
        return "SuperAdmin{" + "superadmin_id=" + superadmin_id + ", superadmin_username=" + superadmin_username + ", superadmin_password=" + superadmin_password + '}';
    }
    
    
    
}
