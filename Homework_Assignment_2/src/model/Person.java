/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Person {
    private String username;
    private String name;
    private String email;
    private String contactInfo;
    private String courseName;
    private String neuID;
    private String role;
    private String address;
    private String password;
    private boolean accountBlockStatus;
    private boolean accountCreatedStatus;
    
    
    public Person(){
    
    }

    public Person(String username, String name, String email, String contactInfo, String courseName, String neuID, String role, String address, String password, boolean accountBlockStatus, boolean accountCreatedStatus) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
        this.courseName = courseName;
        this.neuID = neuID;
        this.role = role;
        this.address = address;
        this.password = password;
        this.accountBlockStatus = accountBlockStatus;
        this.accountCreatedStatus = accountCreatedStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getNeuID() {
        return neuID;
    }

    public void setNeuID(String neuID) {
        this.neuID = neuID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAccountBlockStatus() {
        return accountBlockStatus;
    }

    public void setAccountBlockStatus(boolean accountBlockStatus) {
        this.accountBlockStatus = accountBlockStatus;
    }

    public boolean isAccountCreatedStatus() {
        return accountCreatedStatus;
    }

    public void setAccountCreatedStatus(boolean accountCreatedStatus) {
        this.accountCreatedStatus = accountCreatedStatus;
    }
    
    public void shallowCopyObject(Person person){
        this.username = person.username;
        this.name = person.name;
        this.email = person.email;
        this.contactInfo = person.contactInfo;
        this.courseName = person.courseName;
        this.neuID = person.neuID;
        this.role = person.role;
        this.address = person.address;
        this.password = person.password;
        this.accountBlockStatus = person.accountBlockStatus;
        this.accountCreatedStatus = person.accountCreatedStatus;
    }
    
    @Override
    public String toString(){
        return neuID;
    }
    
}
