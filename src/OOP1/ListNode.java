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
public class ListNode {
    private Konto konto;
    private ListNode next;
    
    public ListNode (Konto konto, ListNode node){
        this.konto = konto;
        this.next = node;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
    
    
}
