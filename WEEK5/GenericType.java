/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class GenericType<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericType<String> type = new GenericType<>();
        type.set("Java"); // valid

        GenericType type1 = new GenericType(); // raw type
        type1.set("Java"); // valid
        type1.set(10); // valid and autoboxing support
        
        String str=type.get();
        int angka=(int)type1.get();
        System.out.print(str+"\n");
        System.out.print(angka+"\n");
    }
}

