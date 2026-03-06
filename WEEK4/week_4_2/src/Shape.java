/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
abstract public class Shape {
    private String shapeName;
    
    public Shape(String name){
        shapeName=name;
    }
    
    public String toString(){
        String result = "Name: " + shapeName + "\n";
        return result;
    }
    
    public String getShapeName(){
        return shapeName;
    }
    public abstract double area();
}
