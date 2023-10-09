/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ASUS
 */
public class UsersDirectory {
    private ArrayList<Person> userList;
    
   
    
    public UsersDirectory() {
        this.userList = new ArrayList<Person>();
        String plainPassword = "password";
        String salt = BCrypt.gensalt();
        String password = BCrypt.hashpw(plainPassword, salt);
        Person admin = new Person("admin","admin","admin@neu.edu","9991111111","","","admin","Huntington Ave",password,false,true);
        userList.add(admin);
    }

    public ArrayList<Person> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<Person> userList) {
        this.userList = userList;
    }
    
    public Person addUser(){
        Person person = new Person();
        this.userList.add(person);
        return person;
    }
    
    public void deletePerson (Person user){
        user.setAccountCreatedStatus(false);
        userList.remove(user);
    }
    
    public Person searchPerson(String NUID){
        for(Person user: this.userList){
            if(user.getNeuID().equals(NUID)){
                return user;
            }
        }
        return null;
    }
    
    public void disableUserAccount (Person user){
        if(user.isAccountBlockStatus()==false)
            user.setAccountBlockStatus(true);
        else
            user.setAccountBlockStatus(false);
    }
}
