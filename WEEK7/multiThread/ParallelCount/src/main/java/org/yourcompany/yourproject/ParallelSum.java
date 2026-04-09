/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author MR.IPI
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class untuk merepresentasikan tugas penjumlahan pada rentang tertentu.
 */
class SumTask implements Runnable {
    private int start;
    private int end;
    private long partialSum = 0;
    private String threadName;

    public SumTask(int start, int end, String threadName) {
        this.start = start;
        this.end = end;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " mulai mengerjakan rentang: " + start + " sampai " + end);
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        System.out.println(threadName + " selesai. Hasil parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class ParallelSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Menerima Input
        System.out.print("Masukkan Jumlah Thread: ");
        int numThreads = input.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        int finalNumber = input.nextInt();

        // List untuk menampung objek tugas dan thread
        List<SumTask> tasks = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        // 2. Pembagian Tugas (Divide and Conquer)
        int rangeSize = finalNumber / numThreads;
        int currentStart = 1;

        for (int i = 0; i < numThreads; i++) {
            int currentEnd;
            
            // Jika ini adalah thread terakhir, ambil sisa angka (handle sisa bagi)
            if (i == numThreads - 1) {
                currentEnd = finalNumber;
            } else {
                currentEnd = currentStart + rangeSize - 1;
            }

            SumTask task = new SumTask(currentStart, currentEnd, "Thread-" + (i + 1));
            tasks.add(task);
            
            Thread thread = new Thread(task);
            threads.add(thread);
            
            // Jalankan Thread
            thread.start();
            
            currentStart = currentEnd + 1;
        }

        // 3. Sinkronisasi (Menunggu semua thread selesai)
        long totalSum = 0;
        try {
            for (Thread t : threads) {
                t.join(); // Main thread menunggu thread t sampai mati
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. Menggabungkan Hasil Akhir
        for (SumTask task : tasks) {
            totalSum += task.getPartialSum();
        }

        System.out.println("----------------------------------------------");
        System.out.println("HASIL AKHIR PENJUMLAHAN: " + totalSum);
        
        
        input.close();
    }
}