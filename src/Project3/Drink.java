/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author Asus
 */
public class Drink extends MenuItem {
    String ukuran; //Atribut Ukuran
    String panasdingin; //Atribut Panas/Dingin
    
    //Membuat Constructor Dengan Non Parameter
    Drink() {
        // Memanggil constructor superclass 
        super("Es Doger", "Minuman", 15000, 100, "Es Serut Dengan Isian Ketan Hitam, Alpukat, Dan Roti Tawar");
        this.ukuran = ukuran;
        this.panasdingin = panasdingin;
    }
}