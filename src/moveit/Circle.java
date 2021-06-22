/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveit;

/**
 *
 * @author sonne
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class Circle {

    private int x, y; ;
    private int width, height;


    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    ///////////////////////////////////////////////////////////////
    /*
        Getters and Setters
    */
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
    public void setXY(Point p){
        this.setX((int) p.getX());
        this.setY((int) p.getY());
    }
    public Point getXY(){
        return new Point(x,y);
    }
    
    ///////////////////////////////////////////////////////////////
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);
        g2d.setColor(Color.GRAY);
        g2d.fill(circle);
    }

   
}