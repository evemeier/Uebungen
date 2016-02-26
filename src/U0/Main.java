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
public class Main {
    public static void main(String[] args){
        System.out.println("hoi");
        Person p1 = new Person("Meier", "Eve");
        p1.print();
        School s1 = new School ("HSLU");
        Student stud1 = new Student();
              
        
        s1.enrolStudent(stud1.getStudentNumber(), stud1);
        s1.printStudent();
    }
}
