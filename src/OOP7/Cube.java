package OOP7;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * A simple Cube with three side lengths.
 */
public class Cube implements Comparable<Cube> {

    private final int number;
    private final int a, b, c;
    
    /**
     * Constructor for objects of class Cube.
     *
     * @param no Nummer.
     * @param a Seite a.
     * @param b Seite b.
     * @param c Seite c.
     */
    public Cube(final int no, final int a, final int b, final int c) {
        number = no;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // your turn!
    public int getVolume() {
        return a*b*c;
    }

    public int getSurface() {
        return ((2*a*b)+(2*a*c)+(2*b*c));
    }

    public int getMaxDimension() {
        throw new NotImplementedException();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.number;
        hash = 23 * hash + this.a;
        hash = 23 * hash + this.b;
        hash = 23 * hash + this.c;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cube other = (Cube) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        if (this.c != other.c) {
            return false;
        }
        return true;
    }
    
    @Override 
    public String toString(){
    return("---------- \n CUBE "+number+"\n Sides: "+a+" "+b+" "+c+"\n Volume= "+getVolume()+"\n Surface= "+getSurface()+"\n ----------");
    //return("Hello");
    }
    
    @Override
    public int compareTo(final Cube c){
        if(this == c){
            return 0;
        }
        return Integer.compare(getVolume(), c.getVolume());
    }    

}
