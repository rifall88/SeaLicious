/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author Asus
 */
public class MenuItem {
    String name; //Atribut Nama
    String category; //Atribut Katagori
    int price; //Atribut Harga
    int stock; //Atribut Stok
    String description; //Atribut Deskripsi
    
    //Membuat Constructor Dengan 5 Parameter
    public MenuItem(String name, String category, int price, int stock, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
    //Membuat Constructor Tanpa Parameter
    public MenuItem() {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
}
