/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author MR.IPI
 */
public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;
//------------------------------------------------------
// Constructor: Sets up the sales person object with
// the given data.
//------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
//-------------------------------------------
// Returns the sales person as a string.
//-------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
//-------------------------------------------
// Returns true if the sales people have
// the same name.
//-------------------------------------------
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
        firstName.equals(((Salesperson)other).getFirstName()));
    }
//--------------------------------------------------
// Order is based on total sales with the name
// (last, then first) breaking a tie.
//--------------------------------------------------
    public int compareTo(Object other) {
    // 1. Casting object 'other' menjadi Salesperson
        Salesperson otherSalesperson = (Salesperson) other;

        // 2. Bandingkan berdasarkan total sales
        if (this.totalSales < otherSalesperson.totalSales) {
            return -1;
        } else if (this.totalSales > otherSalesperson.totalSales) {
            return 1;
        }else {
            return this.lastName.compareTo(otherSalesperson.lastName);
        }
    }
//-------------------------
// First name accessor.
//-------------------------
    public String getFirstName()
    {
        return firstName;
    }
//-------------------------
// Last name accessor.
//-------------------------
    public String getLastName()
    {
        return lastName;
    }
//-------------------------
// Total sales accessor.
//-------------------------
    public int getSales()
    {
        return totalSales;
    }
}