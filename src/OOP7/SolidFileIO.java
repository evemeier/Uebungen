package OOP7;

import java.io.*;
import java.util.LinkedList;
/**
 * Read solid data from file.
 */
public final class SolidFileIO {

    /**
     * Read solid data from file.
     *
     * @param fileName Filename.
     * @return Array of Cubes.
     */
    public static Cube[] readSolids(final String fileName) {
        LinkedList<Cube> list = new LinkedList<>();
        
        try ( BufferedReader bufferedReader =
                new BufferedReader(new FileReader(fileName))){
            
            int number = 1;
            String line;
            
                        
            while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split("[: ]");
            
            switch (tokens[0]) { // is it a Cube, a Sphere or a Cylinder?
                case "C":
                    int s1 = Integer.parseInt(tokens[2]);
                    int s2 = Integer.parseInt(tokens[3]);
                    int s3 = Integer.parseInt(tokens[4]);
                    list.add(new Cube(number, s1, s2, s3));
                    break;
                default:
                    break;
            }
            number++;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list.toArray(new Cube[list.size()]); // siehe API-Dokumentation
    }

    /**
     * Privater Konstruktor.
     */
    private SolidFileIO() {
    }
}
