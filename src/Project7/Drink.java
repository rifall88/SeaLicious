/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project7;

/**
 *
 * @author Asus
 */
public class Drink extends MenuItem {
    private String ukuran; //modifier private
    private String panasdingin; //modifier private
    
    //Membuat Constructor Dengan Non Parameter
    public Drink() {
        // Memanggil constructor superclass 
        super("Es Doger", "Minuman", 15000, 100, "Es Serut Dengan Isian Ketan Hitam, Alpukat, Dan Roti Tawar");
        this.ukuran = ukuran;
        this.panasdingin = panasdingin;
    }
    //Method Overriding
    @Override
    public String displayInfo() {
         return  "==== Menu Yang Ada di SeaLicious ===" +
                "\nNama : " + name + "\nKatagori: " + category + "\nHarga : " + price +
                "\nStok: " + stock + "\nDeskripsi : " + description + "\nUkuran : " 
                + ukuran + "\nPanas/Dingin : " + panasdingin;  
    }
     //Mendeklarasi mutator method
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
     public void setPanasdingin(String panasdingin) {
        this.panasdingin = panasdingin;
    }
    //Mendeklarasi accessor method
    public String getUkuran(){
        return ukuran;
    }
    public String getPanasdingin(){
        return panasdingin;
    }
}
