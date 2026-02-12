/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
import java.util.Scanner;
import java.math.BigInteger;

public class Kapasitas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            for (int i = 0; i < t; i++) {
                String inputAngka = sc.next();
                BigInteger n = new BigInteger(inputAngka);
         
                BigInteger minLong = new BigInteger("-9223372036854775808");
                BigInteger maxLong = new BigInteger("9223372036854775807");
                
                if (n.compareTo(minLong) < 0 || n.compareTo(maxLong) > 0) {
                    System.out.println(inputAngka + " can't be fitted anywhere.");
                } 
                else {
                    System.out.println(inputAngka + " can be fitted in:");
                    
                    BigInteger minByte = new BigInteger("-128");
                    BigInteger maxByte = new BigInteger("127");
                 
                    if (n.compareTo(minByte) >= 0 && n.compareTo(maxByte) <= 0) {
                        System.out.println("* byte");
                    }
                    
                    BigInteger minShort = new BigInteger("-32768");
                    BigInteger maxShort = new BigInteger("32767");
                    
                    if (n.compareTo(minShort) >= 0 && n.compareTo(maxShort) <= 0) {
                        System.out.println("* short");
                    }
                 
                    BigInteger minInt = new BigInteger("-2147483648");
                    BigInteger maxInt = new BigInteger("2147483647");
                    
                    if (n.compareTo(minInt) >= 0 && n.compareTo(maxInt) <= 0) {
                        System.out.println("* int");
                    }
                    System.out.println("* long");
                }
            }
        }
        sc.close();
    }
}