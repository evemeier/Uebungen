/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

/**
 *
 * @author eve
 */
public class LinkedList {
    private ListNode head;
    
    public LinkedList(){
        
    }
    public boolean isFound(Konto konto){
        ListNode currentNode = head;
        while((currentNode != null) && !konto.equals(currentNode.getKonto())){
            currentNode = currentNode.getNext();
        }
        return currentNode != null;
    }
    
    public void insert (Konto konto){
        if (!isFound(konto)){
            head = new ListNode(konto, head);
        }
    }
    
    public void print(){
        ListNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.getKonto().getNo());
            currentNode = currentNode.getNext();
        }
    }
    
    public void length(){
        ListNode currentNode = head;
        int length = 0;
        while (currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        System.out.println(length);
    }
    
    
}
