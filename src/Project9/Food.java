/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project9;

/**
 *
 * @author Asus
 */
public class Food extends MenuItem implements Diskon{
    private String bhnbaku; //modifier private
    private String aslmakanan; //modifier private
    
    @Override
    public String displayInfo() {
        return  "==== Menu Yang Ada di SeaLicious ===" +
                "\nNama : " + name + "\nKatagori: " + category + "\nHarga : " + price +
                "\nStok: " + stock + "\nDeskripsi : " + description + "\nBahan Baku : " 
                + bhnbaku + "\nAsal Makanan : " + aslmakanan; 
    }
    //Method Overriding
    @Override
    public double getDiskon() { 
        return price >= 40000 ? 0.1 : 0.0;
    };
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
