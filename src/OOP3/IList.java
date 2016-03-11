/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP3;

/**
 *
 * @author eve
 */
public interface IList {   
    /* 
     * Diese Methode erhält ein Integer Objekt und gibt nichts zurück. Das Objekt wird in 
     * die Liste eingefügt. 
     */ 
    void add(Integer value); 
    /* 
     * Diese Methode erhält ein Integer Objekt. Dieses wird (ein Vorkommen) aus der Liste 
     * entfernt. Wenn das Objekt entfernt werden konnte, gibt die Methode true zurück, 
     * andernfalls false. 
     */ 
    boolean remove(Integer value); 
    /* 
     * Diese Methode erhält einen ganzzahligen Wert und entfernt ein Integer Objekt mit 
     * diesem Wert. Konnte ein solches Objekt entfernt werden, gibt die Methode true 
     * zurück, false sonst. 
     */ 
    boolean removeValue(int value); 
    /* 
     * Diese Methode erhält einen ganzzahligen Wert und entfernt alle Integer Objekte mit 
     * diesem Wert. Konnten alle Objekte entfernt werden, gibt die Methode true zurück, 
     * false sonst. 
     */ 
    boolean removeValues(int value); 
    /* 
     * Diese Methode gibt die Anzahl Elemente in der Liste zurück. 
     */ 
    int size(); 
    /* 
     * Diese Methode erhält einen ganzzahligen Wert. Sie gibt true zurück, falls ein 
     * Integer Objekt mit diesem Wert existiert, false sonst. 
     */ 
    boolean exists(Integer value); 
    /* 
     * Diese Methode gibt alle Werte der Integer Objekte in der Liste aus. 
     */ 
    void print(); 
} 
