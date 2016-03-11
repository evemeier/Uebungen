/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP3;
import java.util.ArrayList;
/**
 *
 * @author eve
 */
public class ListOne implements IList {
       
    private ArrayList<Integer> list = new ArrayList<>();
    
    @Override
    public void add(Integer value) {
        list.add(value);
    }

    @Override
    public boolean remove(Integer value) {
       // ???
       return(false);
    }

    @Override
    public boolean removeValue(int value) {
        boolean returnvalue = true;
        for (Integer i : list){ 
            if(i.equals(value)) { 
                if(remove(value)==false){ 
                    returnvalue = false; 
                } 
            } 
        } 
        return returnvalue; 
    }

    @Override
    public boolean removeValues(int value) {
        //??
        return removeValue(value);
    }

    @Override
    public int size() {
        return(list.size());
    }

    @Override
    public boolean exists(Integer value) {
        boolean returnwert = false;
        for (Integer i : list){
            if(i.equals(value)){
                return(true);
            }
        }
        return returnwert;
    }

    @Override
    public void print() {
        for(Integer i : list){
            System.out.println(i);
        }
    }
    
}
