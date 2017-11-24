/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Jonas
 */
public class Design {
     private int id;
    private double length;
    private double width;
   private double  height;
   private String name;
   private int user_id;

    public Design() {
    }
   
   

    public Design(int id, double length, double width, double height, String name, int user_id) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.name = name;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "DesignMapper{" + "id=" + id + ", length=" + length + ", width=" + width + ", height=" + height + ", name=" + name + ", user_id=" + user_id + '}';
    }
   
   
}
