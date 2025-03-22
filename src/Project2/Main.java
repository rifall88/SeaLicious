/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project2;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat Object dan memberikan nilai pada masing masing parameter
        MenuItem item1 = new MenuItem("Ikan Bakar", "Makanan", 50000, 100, "Ikan segar dibakar dengan bumbu khas Madura");
        MenuItem item2 = new MenuItem("Pepes Ikan", "Makanan");
        MenuItem item3 = new MenuItem(30000, 100);
        MenuItem item4 = new MenuItem("Ikan Dibungkus Daun Pisang Dengan Bumbu Rempah Khas Madura");
        
        System.out.println("          === Menu Yang Ada di SeaLicious ===");
        System.out.println("--------------------------------------------------------");
        // Menampilkan isi dari Objek item1
        System.out.println("Menu       : " + item1.name);
        System.out.println("Katagori   : " + item1.category);
        System.out.println("Harga      : " + item1.price);
        System.out.println("Stok       : " + item1.stock);
        System.out.println("Deskripsi  : " + item1.description + "\n");
        // Menampilkan isi dari Objek item2
        System.out.println("Menu       : " + item2.name);
        System.out.println("Katagori   : " + item2.category);
        // Menampilkan isi dari Objek item3
        System.out.println("Harga      : " + item3.price);
        System.out.println("Stok       : " + item3.stock);
        // Menampilkan isi dari Objek item4
        System.out.println("Deskripsi  : " + item4.description + "\n");
    }
}