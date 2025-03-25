/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author Asus
 */
public class Food extends MenuItem {
    String bhnbaku; //Atribut Bahan Baku
    String aslmakanan; //Atribut Asal Makanan
    
    //Membuat Constructor Dengan Non Parameter
    Food() {
        // Memanggil constructor superclass 
        super("Ikan Bakar", "Makanan", 50000, 30, "Ikan Yang Dibakar Dengan Bumbu Khas Madura");
        this.bhnbaku = bhnbaku;
        this.aslmakanan = aslmakanan;
    }
}
