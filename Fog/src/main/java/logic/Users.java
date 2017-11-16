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
public class Users {

    private int user_id;
    private String user_name;
    private String user_password;
    private String user_email;
    private String firstName;
    private String lastName;
    private String streetName;
    private int streetNumber;
    private String city;
    private String zipCode;
    private String phone;
    private String address;

    public Users(int user_id, String user_name, String user_password, String user_email, String firstName, String lastName, String streetName, int streetNumber, String city, String zipCode, String phone,String address) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.address = address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" + "user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password + ", user_email=" + user_email + ", firstName=" + firstName + ", lastName=" + lastName + ", streetName=" + streetName + ", streetNumber=" + streetNumber + ", city=" + city + ", zipCode=" + zipCode + ", phone=" + phone + ", address=" + address + '}';
    }

    
    
    
    



 
    



}
