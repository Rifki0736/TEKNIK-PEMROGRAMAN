/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author MR.IPI
 */
public class Strings {
    
    public static void main (String[] args)
    {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("\nHow string do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        
        System.out.println ("\nEnter the String...");
        for (int i = 0; i < size; i++)
            stringList[i] = scan.next();
        
        Sorting.selectionSort(stringList);
        System.out.println ("\nYour string in ascending order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        
        Sorting.insertionSort(stringList);
        System.out.println ("\nYour string in descending order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        
        System.out.println ();
    }
    
}
