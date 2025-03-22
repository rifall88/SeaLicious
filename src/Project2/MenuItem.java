/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project2;

/**
 *
 * @author Asus
 */
public class MenuItem {
    String name; //Atribut Nama
    String category; //Atribut Katagori
    int price; //Atribut Harga
    int stock; //Atribut Harga
    String description; //Atribut Deskripsi
   
    //Membuat Constructor Dengan 5 Parameter
    MenuItem(String name, String category, int price, int stock, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
    //Membuat Constructor Dengan 2 Parameter
    MenuItem(String name, String category) {
        this.name = name;
        this.category = category;
    }
    //Membuat Constructor Dengan 2 Parameter
    MenuItem(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }
    //Membuat Constructor Dengan 1 Parameter
    MenuItem(String description) {
        this.description = description;
    }
}
