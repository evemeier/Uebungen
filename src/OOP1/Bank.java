/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author eve
 */
public class Bank {
    private String name;
    private List<Konto> accountList = new ArrayList<Konto>();

    public Bank(String name) {
        this.name = name;
    }
    
    public void openKonto(Konto konto){
        
        accountList.add(konto);
    }
    public void openSpar(Spar sparkonto){
        accountList.add(sparkonto);
    }
    public int noOfAccounts(){
        return accountList.size();
    }
    public void printAccounts(){
        for (Konto k : accountList){
            System.out.println("Kontonummer:"+k.getNo());
        }
    }
    
    public void printFund(){
        double fund = 0;
        for (Konto k : accountList){
            fund += k.getSaldo();
        }
        System.out.println("Fund:" + fund);
    }
    
}
