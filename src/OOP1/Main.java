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
public class Main {
    
    public static void main(String[] args){
        
        System.out.println("hello");
        
        Bank b1 = new Bank("Geili Sau");
        
        Spar s1 = new Spar(10_000, 5, 2_000);
        System.out.println(s1.getSaldo());
        s1.payOut(1_000);
        System.out.println(s1.getSaldo());
        s1.payOut(20_000);
        System.out.println(s1.getSaldo());        
        s1.payIn(2_000);
        System.out.println(s1.getSaldo()); 
        
        Konto k1 = new Konto(4_000, 1);
       
        b1.openSpar(s1);
        b1.openKonto(k1);
        b1.printFund();
        b1.printAccounts();     
      
    }   
}
