/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author Asus
 */
public class MenuItem {
    private String name; //Atribut Nama
    private String category; //Atribut Katagori
    private int price; //Atribut Harga
    private int stock; //Atribut Harga
    private String description; //Atribut Deskripsi
   
    //Membuat Fungsi Setter Yang di Gunakan Untuk Mengubah Nilai Atribut
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(int price) {
        this.price = price;
    }
       public void setStock(int stock) {
        this.stock = stock;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Method Atau Fungsi Untuk Menampilkan Daftar Menu
    public void displayMenuItem() {
        System.out.println("Menu : " + name + " | Katagori : " + category + " | Harga : Rp " + price + " | Stok : " + stock);
        System.out.println("Deskripsi : " + description + "\n");
    }
}

