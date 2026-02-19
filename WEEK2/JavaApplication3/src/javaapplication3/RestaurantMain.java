package javaapplication3;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class RestaurantMain 
{
    public static void main(String[] args) 
    {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        menu.tambahMenuMakanan("Cimol Bojot teteh", 20000, 67);
        menu.tambahMenuMakanan("Es teh manis tawar panas", 5000, 93);
        menu.tambahMenuMakanan("tahu bulat", 5000, -7);
        menu.tampilMenuMakanan();
        menu.pemesanan(0,19);
        menu.tampilMenuMakanan();
        menu.pemesanan(1,15);
        menu.tampilMenuMakanan();
        menu.pemesanan(3,15);
        menu.tampilMenuMakanan();
        menu.pemesanan(4,17);
        menu.pemesanan(5,17);
        menu.tampilMenuMakanan();
    }
}


