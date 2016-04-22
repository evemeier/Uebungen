package OOP7;
import java.util.Comparator;

public class SurfaceComparator implements Comparator<Cube> {
    
    @Override
    public int compare(Cube c1, Cube c2) {
        return Integer.compare(c1.getSurface(), c2.getSurface());
    }
}