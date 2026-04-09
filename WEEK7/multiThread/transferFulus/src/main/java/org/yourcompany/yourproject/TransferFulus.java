package org.yourcompany.yourproject;

class Account {
    int balance = 150;

}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        System.out.println("--- HASIL AWAL ---");
        System.out.println("Saldo Awal acc1: " + acc1.balance);
        System.out.println("Saldo Awal acc2: " + acc2.balance);

        // Thread 1: Transfer dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { // Mengunci resource pertama
                System.out.println("Thread 1: Mengunci acc1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (acc2) { // Mengunci resource kedua
                    System.out.println("Thread 1: Mengunci acc2 dan melakukan transfer.");
                    acc2.balance += acc1.balance;
                    acc1.balance = 0;
                }
            }
        });

        // Thread 2: Transfer dari acc2 ke acc1 (URUTAN DISAMAKAN UNTUK MENGHINDARI DEADLOCK)
        Thread t2 = new Thread(() -> {
            // Kita ubah urutannya agar sama dengan Thread 1: acc1 dulu baru acc2
            synchronized (acc1) { 
                System.out.println("Thread 2: Menunggu acc1 dilepas, lalu mengunci acc1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (acc2) {
                    System.out.println("Thread 2: Mengunci acc2 dan melakukan transfer.");
                    acc1.balance += acc2.balance;
                    acc2.balance = 0;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();

        System.out.println("--- HASIL TRANSAKSI PERTAMA ---");
        System.out.println("Saldo baru acc1: " + acc1.balance);
        System.out.println("Saldo baru acc2: " + acc2.balance);

        t2.join();

        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}