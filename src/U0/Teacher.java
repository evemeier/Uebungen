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
public class Teacher extends Person {
    private String subject;
    private int salary;
 
    public Teacher(){
        super();
    }
    public Teacher(String subject, int salary){
        super();
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Subject: " + subject + "\nSalary: " + salary);

    }
}