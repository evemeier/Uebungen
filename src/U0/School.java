/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U0;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eve
 */
public class School {
    private String name;
    private HashMap<Integer, Student> studentList = new HashMap<Integer, Student>(); 

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap getStudentList() {
        return studentList;
    }

    public void setStudentList(HashMap studentList) {
        this.studentList = studentList;
    }

    public void enrolStudent(int studentNumber, Student student){
        studentList.put(studentNumber, student);
    }
    public void printStudent(){
        for(Integer i : studentList.keySet()){
            System.out.println(studentList.get(i));
            Student penis = studentList.get(i);
            System.out.println(penis.getName());
            
        }
    }
}
