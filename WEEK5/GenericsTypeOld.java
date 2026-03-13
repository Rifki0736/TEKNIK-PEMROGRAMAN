/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class GenericsTypeOld {

    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }
public static void main(String args[]) {
        GenericsTypeOld type1 = new GenericsTypeOld();
        GenericsTypeOld type2 = new GenericsTypeOld();
        type1.set("Java");
        String str = (String) type1.get(); // type casting, error prone and can cause ClassCastException
        type2.set(98);
        int angka = (int) type2.get();
        System.out.print(str + "\n");
        System.out.print(angka + "\n");
    }
}

