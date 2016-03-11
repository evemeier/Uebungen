/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;
import java.util.Deque;
import java.util.LinkedList;
/**
 *
 * @author eve
 */

public class Queue<T> {
    private Deque<T> queue = new LinkedList<>();
    public void enqueue (T x){
        //Fügt am Ende in die Warteschlange ein, falls nicht voll
        if (!isFull()){
        queue.addLast(x);
        }
    }
    public T dequeue(){
        //Entfernt das erste Element aus der Warteschlange, falls nicht leer
        if(!isEmpty()){
            return queue.removeLast();
        }
        else{
               return(null);
        }
    }
    public boolean isEmpty(){
        //liefert true wenn kein Element in Queue
        return queue.isEmpty(); //from Collection
    }
    public boolean isFull(){
        //liefert true wenn Queue voll
        return false;
    }
    
}   
