package javaapplication3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class Restaurant 
{
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;
    
    public Restaurant() 
    {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) 
    {   if(stok>0){
        setNama_makanan(id,nama);
        setHarga_makanan(id,harga);
        setStok(id,stok);
        setId((byte)(getId()+1));
        System.out.println("input stok " + nama + " sukses");
        }else{
            System.out.println("input stok " + nama + " tidak valdi");
        }
    }

    public void tampilMenuMakanan() 
    {
        for (int i = 0; i < id; i++) 
        {
            if (!isOutOfStock(i))   
            {
                System.out.println(
                    i + ". " + nama_makanan[i] +
                    " [" + stok[i] + "]" +
                    "\tRp. " + harga_makanan[i]
                );
            }
        }
    }

    public boolean isOutOfStock(int index) 
    {
        return stok[index] == 0;
    }

    public void pemesanan(int index,int jumlah) {
        if (index >= 0 && index < id) { // cek idx daftar menu
            if (!isOutOfStock(index)&&getStok(index)>= jumlah) {
                setStok(index,getStok(index)-jumlah);
                System.out.println("Pesanan " + getNama_makanan(index)  + " sebanyak " +jumlah+" berhasil!");
            } else {
                System.out.println("Maaf, stok " + getNama_makanan(index) + " gak cukup!!");
            }
        } else {
            System.out.println("Menu tidak ditemukan!");
        }
    }
    
   
    public String getNama_makanan(int index) {
        return nama_makanan[index];
    }
    public void setNama_makanan(int index, String nama) {
        this.nama_makanan[index] = nama;
    }

 
    public double getHarga_makanan(int index) {
        return harga_makanan[index];
    }
    public void setHarga_makanan(int index, double harga) {
        this.harga_makanan[index] = harga;
    }


    public int getStok(int index) {
        return stok[index];
    }
    public void setStok(int index, int jumlahStok) {
        this.stok[index] = jumlahStok;
    }

    
    public static int getId() {
        return id;
    }
    public static void setId(byte newId) {
        Restaurant.id = newId; 
    }
}
