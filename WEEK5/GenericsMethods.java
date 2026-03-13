/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class GenericsMethods {

    // Java Generic Method
    public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericType<String> g1 = new GenericType<>();
        g1.set("Java");

        GenericType<String> g2 = new GenericType<>();
        g2.set("Java");

        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        // above statement can be written simply as 
        isEqual = GenericsMethods.isEqual(g1, g2);
        
        if(isEqual){
            System.out.print("sama\n");
        }else{
            System.out.print("tidak sama\n");
        }

        /*
         * This feature, known as type inference, allows you to invoke
         * a generic method as an ordinary method, without specifying 
         * a type between angle brackets 
         */
        
        // Compiler will infer the type that is needed
    }
}
