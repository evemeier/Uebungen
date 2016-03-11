/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author eve
 */
public class DoubleLinkedList<E> {

    private int count=0;
    private ListNode<E> head;    
    private ListNode<E> tail;
    
    public DoubleLinkedList(){
 
    }
        
    public void insert (E data){
        ListNode<E> node = new ListNode<E>(data);
        
        if (count==0){  //Erstes Element = letztes Element
            this.head = node;
            this.tail = node;
        }
        else{
            //dem letzten Element node als nächstes anfügen
            this.tail.setNext(node);
            //node als letztes Element setzen
            this.tail = node;
        }
        count ++;
    }
    
    public ListNode<E> get(int index) { 
       ListNode<E> node = head; 
       // Durchlaufen der ganzen Liste bis zur gesuchten Position 
       for(int i=0; i<index; i++){  
            node = node.getNext(); 
       } 
       return node; 
    }
    
    public boolean remove(int index){
        ListNode<E> node = get(index); 
        node.getPrev().setNext(node.getNext()); 
        node.getNext().setPrev(node.getPrev()); 
        count--; 
        return true; 
    }
    
    public void length(){
        System.out.println(count);
    }
    
    
}