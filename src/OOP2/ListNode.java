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
public class ListNode<E> {
    public E data;
    public ListNode<E> next;
    public ListNode<E> prev;
    
    public ListNode (E data){
        this.data = data;
    }
    public ListNode getNext() {
        return next;
    }
    public ListNode getPrev(){
        return prev;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }
    public void setPrev (ListNode<E> prev){
        this.prev = prev;
    }
    public E getData(){
        return data;
    }
}
