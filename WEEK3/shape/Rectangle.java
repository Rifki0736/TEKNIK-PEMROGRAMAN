/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author MR.IPI
 */
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        super();
        setWidth(1.0);
        setLength(1.0);
    }
    public Rectangle(double w, double l){
        super();
        setWidth(w);
        setLength(l);
    }
    public Rectangle(double w, double l, String c, Boolean f){
        super(c,f);
        setWidth(w);
        setLength(l);
    }
    
    
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double w){
        this.width=w;
    }
    public void setLength(double l){
        this.length=l;
    }
    
    public double getArea(){
        return length*width; 
    }
    public double getParimeter(){
        return 2*(length+width);
    }
    
    @Override
    public String toString(){
        return "A rectangle with width= "+getWidth()+" and length= "+getLength()+ ",which is a subclass of " +super.toString();
    }
}
