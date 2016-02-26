/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U0;

/**
 *
 * @author eve
 */
public class Person {
    private String name;
    private String firstName;
    
    public Person(){
        
    }

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void print(){
        System.out.println("Name: " + name + "\nVorname: " + firstName);
    }
    
}
