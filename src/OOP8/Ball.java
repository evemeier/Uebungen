/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP8;
import java.awt.Color;
/**
 *
 * @author eve
 */
public class Ball implements Runnable {
    
    private int radius = 0;
    private int x = 0;
    private int y = 0;
    private Color color;
    private int speed;
    private boolean isAlive;
    
    public Ball(int x, int y){
        setX(x);
        setY(y);
        setRadius();
        setSpeed();
        setColor();        
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = randomInt(20, 50);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
         this.color = new Color((float) Math.random(), (float) Math.random(),(float) Math.random());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = randomInt(10, 20);
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void run() {
        this.isAlive = true;
        
        //Wann ist mein Ende des Balles - eigentlich Fensterhöhe minus Radius
        int end = 387 - getRadius();
       // Fallen 
        for (int i = this.y; i < end; i++) {
            this.y = i;
            try {
                Thread.sleep(this.speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        //Ausbleichen am Schluss
        while (this.color.getRGB() != -1) {
            this.color = this.color.brighter();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Tot machen ^^ 
        this.isAlive = false;       
    }
    
    private int randomInt(int low, int high) {
        high++;
        return (int) (Math.random() * (high - low) + low);
    }
    
    
    
}
