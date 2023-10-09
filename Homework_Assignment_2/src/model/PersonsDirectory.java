/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PersonsDirectory {
    
    private ArrayList<Person> personList;

    public PersonsDirectory() {
        this.personList = new ArrayList<Person>();           
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson (Person person){
        personList.remove(person);
    }
    
    public Person searchPerson(String NUID){
        for(Person person: personList){
            if(person.getNeuID().equals(NUID)){
                return person;
            }
        }
        return null;
    }
    
    public void updatePersonEnabledStatus(Person person, String username, String password,boolean status){
        for (Person personU : personList) {
            if (personU.getNeuID().equals(person.getNeuID())) {
                if(status==true){
                    personU.setAccountCreatedStatus(true);
                    personU.setUsername(username);
                    personU.setPassword(password);
                    break;
                }else{
                    personU.setAccountCreatedStatus(false);
                    personU.setUsername(username);
                    personU.setPassword(password);
                    break;
                }
                
            }
        }

    }
    
    
    public void disableUserAccount (Person user){
        for (Person personU : personList) {
             if (personU.getNeuID().equals(user.getNeuID())) {
                if(user.isAccountBlockStatus()==false)
                    personU.setAccountBlockStatus(true);
                else
                    personU.setAccountBlockStatus(false);
            }
        }
    }
        
    
}
