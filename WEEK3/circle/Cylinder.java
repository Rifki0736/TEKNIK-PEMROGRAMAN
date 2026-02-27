/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author MR.IPI
 */

 public class Cylinder extends Circle { 
// Save as "Cylinder.java" 
    private double height; 
// private variable 
 // Constructor with default color, radius and height 
    public Cylinder() { 
        super();
        // call superclass no-arg constructor Circle()  
        this.height = 1.0; 
 } 
 // Constructor with default radius, color but given height  
    public Cylinder(double height) { 
        super();
        // call superclass no-arg constructor Circle()  
        this.height = height; 
    } 
 // Constructor with default color, but given radius, height  
    public Cylinder(double radius, double height) { 
        super(radius); // call superclass constructor Circle(radius)  
        this.height = height; 
    }
    
    public Cylinder (double radius, double height, String color){
        super(radius,color);
        this.height = height; 
    }
 // A public method for retrieving the height
    public double getHeight() { 
        return height; 
    } 
 // A public method for computing the volume of cylinder 
 // use superclass method getArea() to get the base area 
    public double getVolume() { 
        return super.getArea() * height; 
    } 
    
    public double getBaseArea(){
        return super.getArea();
    }
            
    @Override
     public double getArea() { 
        return (getRadius() * height *2* Math.PI)+(2* super.getArea()); 
    }
     
    @Override 
    public String toString() { // di dalam kelas Cylinder 
        return "Cylinder: subclass of " + super.toString() 
        // menggunakan toString() milik  Circle 
        + " height=" + height; 
    }

} 
   

