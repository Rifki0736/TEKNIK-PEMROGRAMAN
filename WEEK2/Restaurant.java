public class Restaurant 
{
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id = 0;
    public Restaurant() 
    {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
    this.nama_makanan[id] = nama;
    this.harga_makanan[id] = harga;
    this.stok[id] = stok;
    }
    public void tampilMenuMakanan() 
    {
        for (int i = 0; i <= id; i++) 
        {
            if (!isOutOfStock(i))   
             {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
             }
         }
    }
    public boolean isOutOfStock(int id) 
    {
        return (stok[id] == 0) ;
        
    }
    public static void nextId() 
    {
        id++;
    }

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        menu.tampilMenuMakanan();
    }
}

