/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author MR.IPI
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(){
        super();
        setRadius(1.0);
    }
    public Circle(double r){
        super();
        setRadius(r);
    }
    public Circle(double r,String c, Boolean f){
        super(c,f);
        setRadius(r);
    }
    
    public double getRadius (){
        return radius;
    }
    public void setRadius(double d){
        this.radius=d;
    }
    
    public double getArea(){
        return radius * radius * Math.PI; 
    }
    public double getParimeter(){
        return radius*2*Math.PI;
    }
    
    @Override
    public String toString(){
        return "A circle with radius= "+getRadius()+" ,which is a subclass of "+super.toString();
    }
}
