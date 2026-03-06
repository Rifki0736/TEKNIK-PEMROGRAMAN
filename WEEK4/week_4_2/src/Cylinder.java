/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class Cylinder extends Shape{
    private double radius;
    private double height;

    //----------------------------------
    // Constructor: Sets up the sphere.
    //----------------------------------
    public Cylinder(double r, double h)
    {
        super("Cylinder");
        radius = r;
        height= h;
    }
    //-----------------------------------------
    // Returns the surface area of the sphere.
    //-----------------------------------------
    public double area()
    {
        return (2*Math.PI*(radius*radius))+(2*Math.PI*radius*height);
    }
}
