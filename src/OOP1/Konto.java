package OOP1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eve
 */


public class Konto {
    private static int count = 0;
    private int no;
    private double saldo;
    private double rate;
    
    public Konto() {
        no = count;
        count++;
        saldo = 0.0;
        rate = 0.0 ;
    }
    public Konto(double saldo, double rate ){
        no = count;
        count++;
        this.saldo = saldo;
        this.rate = rate;
    
    }
    public void payIn (final double eSumme){
        if (eSumme > 0.0){
            saldo += eSumme;
        }
    }
    public void payOut(final double oSumme){
        if(oSumme >= 0.0){
            saldo = saldo - oSumme;
        }
    }
    public void print(){
        System.out.println("Konto: " + no + "Saldo: " + saldo + "Rate: " + rate);
    }
            
}
