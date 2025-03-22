/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author Asus
 */
public class Main {
   public static void main(String[] args) {
        // Membuat Object
        MenuItem item1 = new MenuItem();
        MenuItem item2 = new MenuItem();
        
        /* Mengubah nilai atribut objek item1 menggunakan setter Methods*/
        item1.setName("Ikan Bakar");
        item1.setCategory("Makanan");
        item1.setPrice(50000);
        item1.setStock(100);
        item1.setDescription("Ikan Yang Dibakar Dengan Bumbu Khas Madura");
        /* Mengubah nilai atribut objek item2 menggunakan setter Methods*/
        item2.setName("Pepes Ikan");
        item2.setCategory("Makanan");
        item2.setPrice(30000);
        item2.setStock(100);
        item2.setDescription("Ikan Dibungkus Daun Pisang Dengan Bumbu Rempah Khas Madura");
        // Menampilkan Daftar Menu Yang Ada di SeaLicious
        System.out.println("          === Menu Yang Ada di SeaLicious ===");
        System.out.println("--------------------------------------------------------");
        item1.displayMenuItem();
        item2.displayMenuItem();   
   }
}

