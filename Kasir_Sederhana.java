/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Kasir_Sederhana;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author jirya
 */
public class Kasir_Sederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> daftarBarang = new HashMap<>();
        daftarBarang.put("Baju", 50000);
        daftarBarang.put("Celana", 70000);
        daftarBarang.put("Sepatu", 150000);

        System.out.println("Daftar barang yang tersedia:");
        for (String barang : daftarBarang.keySet()) {
            System.out.println(barang + " - " + daftarBarang.get(barang));
        }

        int totalHarga = 0;
        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.print("Masukkan barang yang dibeli (atau selesai untuk mengakhiri pembelian): ");
            String barang = scanner.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                isSelesai = true;
            } else if (daftarBarang.containsKey(barang)) {
                totalHarga += daftarBarang.get(barang);
                System.out.println("Harga " + barang + ": " + daftarBarang.get(barang));
            } else {
                System.out.println("Barang tidak ditemukan");
            }
        }

        System.out.println("Total harga: " + totalHarga);
    }
    
}
