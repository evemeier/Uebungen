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
public class Spar extends Konto {
    private double maxOut;


    public Spar(double maxOut, double saldo, double rate) {
        super(saldo, rate);
        this.maxOut = maxOut;
    }
    
    public double getSaldo(){
        return super.saldo;
    }
    
    @Override
    public void payOut(double oSumme){
        if(oSumme > maxOut){
            System.out.println("Nicht genug Saldo");
        }
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Maximale Ausgabe:" + maxOut);
    }
    
}
