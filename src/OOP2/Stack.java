/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;
import java.util.ArrayList;
/**
 *
 * @author eve
 */
/**
 * Stack-Implementation mit Array of Objects.
 * Achtung: KEINE Fehlerbehandlung wenn voll oder leer.
 * @param <T> Type of data to store
 */
public final class Stack <T> {
  //  private final int size;
    private final ArrayList<T> stack;
    private int topIndex = 0;

    /**
     * Konstruktor.
     * @param size Grösse des Stacks.
     */
    public Stack() {
        //this.size = size;
        this.stack = new ArrayList<>();
    }

    /**
     * Pusht ein Object auf den Stack.
     * @param object Object das gepushed wird.
     */
    public void push(final T object) {
        this.stack.add(topIndex, object);
        this.topIndex++;
    }

    /**
     * Popt ein Object vom Stack.
     * @return Object das gepopt wird.
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        this.topIndex--;
        return (this.stack.get(topIndex) );
    }

    /**
     * Prüft ob der Stack leer ist.
     * @return TRUE wenn leer.
     */
    public boolean isEmpty() {
        return (this.topIndex == 0);
    }

    public int getTopIndex() {
        return topIndex;
    }

}

