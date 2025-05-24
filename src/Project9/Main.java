/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project9;
import java.util.InputMismatchException; // Import class exception jika input tidak sesuai tipe data
import java.util.Scanner; // Import scanner untuk input dari user

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek scanner untuk membaca input dari user

        Food food = new Food();     // Membuat objek food dari class Food
        Drink drink = new Drink();  // Membuat objek drink dari class Drink

        try {
            // === Input Data Makanan ===
            System.out.println("=== INPUT DATA MAKANAN ===");
            System.out.print("Nama makanan: ");
            food.setName(input.nextLine()); // Input nama makanan

            System.out.print("Kategori: ");
            food.setCategory(input.nextLine()); // Input kategori makanan

            System.out.print("Harga: ");
            food.setPrice(input.nextInt()); // Input harga makanan (harus integer)

            System.out.print("Stok: ");
            food.setStock(input.nextInt()); // Input stok makanan (harus integer)

            input.nextLine(); // Menyerap newline yang tersisa setelah input int

            System.out.print("Deskripsi: ");
            food.setDescription(input.nextLine()); // Input deskripsi makanan

            System.out.print("Bahan Baku: ");
            food.setBhnbaku(input.nextLine()); // Input bahan baku makanan

            System.out.print("Asal Makanan: ");
            food.setAslmakanan(input.nextLine()); // Input asal makanan
            System.out.println("Mendapat Diskon " + (food.getDiskon() * 100) + "%");

            // === Input Data Minuman ===
            System.out.println("\n=== INPUT DATA MINUMAN ===");
            System.out.print("Nama minuman: ");
            drink.setName(input.nextLine()); // Input nama minuman

            System.out.print("Kategori: ");
            drink.setCategory(input.nextLine()); // Input kategori minuman

            System.out.print("Harga: ");
            drink.setPrice(input.nextInt()); // Input harga minuman (harus integer)

            System.out.print("Stok: ");
            drink.setStock(input.nextInt()); // Input stok minuman (harus integer)

            input.nextLine(); // Menyerap newline yang tersisa setelah input int

            System.out.print("Deskripsi: ");
            drink.setDescription(input.nextLine()); // Input deskripsi minuman

            System.out.print("Ukuran: ");
            drink.setUkuran(input.nextLine()); // Input ukuran minuman

            System.out.print("Panas / Dingin: ");
            drink.setPanasdingin(input.nextLine()); // Input preferensi panas atau dingin
            System.out.println("Mendapat Diskon " + (drink.getDiskon() * 100) + "%");
            
             // === Tampilkan hasil input ===
            System.out.println("\n" + food.displayInfo()); // Tampilkan data makanan
            System.out.println("\n" + drink.displayInfo()); // Tampilkan data minuman

        } catch (InputMismatchException e) {
            // Jika user mengisi angka dengan huruf, tampilkan pesan error
            System.out.println("Input tidak valid. Pastikan harga dan stok berupa angka.");
        } catch (Exception e) {
            // Penanganan untuk kesalahan umum lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            input.close(); // Menutup scanner untuk mencegah memory leak
        }
    }
}
