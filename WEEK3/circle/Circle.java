/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author MR.IPI
 */
public class Circle {

    private double radius;
    private String color;
    public Circle() { // 1st (default) constructor 
        radius = 1.0; 
        color = "red"; 
    } 
 /** Constructs a Circle instance with the given radius and default color */  
    public Circle(double r) { // 2nd constructor 
        radius = r; 
        color = "red"; 
    }
    
    public Circle(double r, String c) { // 2nd constructor 
        radius = r; 
        setColor(c); 
    }
 /** Returns the radius */ 
    public double getRadius() { 
        return radius; 
    } 
 /** Returns the area of this Circle instance */ 
    public double getArea() { 
        return radius * radius * Math.PI; 
    } 
 /** * Return a self-descriptive string of this instance in the form of  * Circle[radius=?,color=?]  
 */ 
    public String toString() { 
        return "Circle[radius=" + radius + " color=" + color + "]";  
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        this.color=c;
    }
    
}
