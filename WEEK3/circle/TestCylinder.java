/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author MR.IPI
 */
public class TestCylinder { // save as "TestCylinder.java" 
    public static void main(String[] args) { 

    // Declare and allocate a new instance of cylinder 
    // with default color, radius, and height 
    Cylinder c1 = new Cylinder(); 
    System.out.println("\nCylinder:"  
        + " \nradius=" + c1.getRadius()  
        + " \nheight=" + c1.getHeight()  
        + " \nbase area=" + c1.getBaseArea()
        + " \nsurface area=" + c1.getArea()
        + " \nvolume=" + c1.getVolume()
        + " \nColor="+c1.getColor()
        + " \n"+c1.toString()); 
    // Declare and allocate a new instance of cylinder 
    // specifying height, with default color and radius 
    Cylinder c2 = new Cylinder(10.0); 
    System.out.println("\nCylinder:"  
        + " \nradius=" + c2.getRadius()  
        + " \nheight=" + c2.getHeight()  
        + " \nbase area=" + c2.getBaseArea()
        + " \nsurface area=" + c2.getArea()
        + " \nvolume=" + c2.getVolume()
        + " \nColor="+c2.getColor()
        + " \n"+c2.toString()); 
    // Declare and allocate a new instance of cylinder 
    // specifying radius and height, with default color 
    Cylinder c3 = new Cylinder(2.0, 10.0); 
    System.out.println("\nCylinder:"  
        + " \nradius=" + c3.getRadius()  
        + " \nheight=" + c3.getHeight()  
        + " \nbase area=" + c3.getBaseArea() 
        + " \nsurface area=" + c3.getArea()
        + " \nvolume=" + c3.getVolume()
        + " \nColor="+c3.getColor()
        + " \n"+c3.toString()); 
    
    Cylinder c4 = new Cylinder(2.0, 6.7, "magenta"); 
    System.out.println("\nCylinder:"  
        + " \nradius=" + c4.getRadius()  
        + " \nheight=" + c4.getHeight()  
        + " \nbase area=" + c4.getBaseArea()
        + " \nsurface area=" + c4.getArea()
        + " \nvolume=" + c4.getVolume()
        + " \nColor="+c4.getColor()
        + " \n"+c4.toString());
    } 
    
} 

