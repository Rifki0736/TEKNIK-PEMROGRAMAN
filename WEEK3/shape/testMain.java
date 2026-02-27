/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author MR.IPI
 */
public class testMain {
    public static void main(String[] args) {
        Shape s1=new Shape();
        System.out.println(s1.toString());
        
        Shape s2=new Shape("purple",false);
        System.out.println(s2.toString());
        
        Circle c1=new Circle();
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getParimeter());
        
        Circle c2=new Circle(3.5);
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getParimeter());
        
        Circle c3=new Circle(5.0,"pink",false);
        System.out.println(c3.toString());
        System.out.println(c3.getArea());
        System.out.println(c3.getParimeter());
        
        Rectangle r1=new Rectangle();
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getParimeter());
        
        Rectangle r2=new Rectangle(3.5,7.8);
        System.out.println(r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getParimeter());
        
        Rectangle r3=new Rectangle(4.4,9.9,"magenta",false);
        System.out.println(r3.toString());
        System.out.println(r3.getArea());
        System.out.println(r3.getParimeter());
        
        Square q1=new Square();
        System.out.println(q1.toString());
        System.out.println(q1.getArea());
        System.out.println(q1.getParimeter());
        
        Square q2=new Square(9.7);
        System.out.println(q2.toString());
        System.out.println(q2.getArea());
        System.out.println(q2.getParimeter());
        
        Square q3=new Square(2.9,"yellow",false);
        System.out.println(q3.toString());
        System.out.println(q3.getArea());
        System.out.println(q3.getParimeter());

        
    }
}
