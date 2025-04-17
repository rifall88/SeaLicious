/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project5;

/**
 *
 * @author Asus
 */
public class Food extends MenuItem {
    private String bhnbaku; //modifier private
    private String aslmakanan; //modifier private
    
    //Membuat Constructor Dengan Non Parameter
    public Food() {
        // Memanggil constructor superclass 
        super("Ikan Bakar", "Makanan", 50000, 30, "Ikan Yang Dibakar Dengan Bumbu Khas Madura");
        this.bhnbaku = bhnbaku;
        this.aslmakanan = aslmakanan;
    }
    //Method Overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nBahan Baku : " + bhnbaku + "\nAsal Makanan : " + aslmakanan; 
    }
    //Mendeklarasi mutator method
    public void setBhnbaku(String bhnbaku) {
        this.bhnbaku = bhnbaku;
    }
     public void setAslmakanan(String aslmakanan) {
        this.aslmakanan = aslmakanan;
    }
    //Mendeklarasi accessor method
    public String getBhnbaku(){
        return bhnbaku;
    }
    public String getAslmakanan(){
        return aslmakanan;
    }
}
