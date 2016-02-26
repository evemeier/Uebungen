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
public class Student extends Person{
    
   private final int studentNumber;
   private String course;
   private static int number=1000;
   
   public Student(){
       super("Cali", "Dari");
       studentNumber = number;
       number++;
   }
   
   public Student(String course){
       super();
       this.course = course;
       studentNumber = number;
       number++;
   }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Student.number = number;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    
    
   
   @Override 
   public void print(){
       super.print();
       System.out.println("Studentennummer: " + studentNumber + "\nKurs: " + course);
   }
}
