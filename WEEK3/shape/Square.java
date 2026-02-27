package shape;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double s){
        super(s,s);
    }
    public Square(double s,String c, Boolean f){
        super(s,s,c,f);
    }
    
    public double getSide(){
        return super.getLength();
    }
    public void setside(double s){
        setWidth(s);
        setLength(s);
    }
    @Override
    public void setWidth(double s){
        super.setLength(s);
        super.setWidth(s);
    }
    @Override
    public void setLength(double s){
        super.setLength(s);
        super.setWidth(s);
        
    }
    
     
    @Override
    public String toString(){
        return "A square with side= "+getSide()+ ",which is a subclass of " +super.toString();
    }
}
