/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressbook;

/**
 *
 * @author eve
 */
public class InvalidEmailException extends Exception 
{
    public InvalidEmailException(String s) 
    {
        super("my Exception" + s);
    }   
}

