/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

/**
 *
 * @author MR.IPI
 */
public class Shape {

   private String color;
   private Boolean filled;
   
   public Shape(){
       setColor("Green");
       setBoolean(true);
   }
   public Shape(String c,Boolean f){
       setColor(c);
       setBoolean(f);
   }
   
   public String getColor (){
       return color;
   }
   public Boolean isFilled(){
       return filled;
   }
   
   public void setColor(String c){
       this.color=c;
   }
   public void setBoolean(Boolean f){
       this.filled=f;
   }
    
   public String toString(){
       return "A Shape with color of "+color+" and "+(filled ? "filled" : "not filled");
   }
}
