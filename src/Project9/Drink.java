/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project9;

/**
 *
 * @author Asus
 */
public class Drink extends MenuItem implements Diskon {
    private String ukuran; //modifier private
    private String panasdingin; //modifier private
    
    //Method Overriding
    @Override
    public String displayInfo() {
         return  "==== Menu Yang Ada di SeaLicious ===" +
                "\nNama : " + name + "\nKatagori: " + category + "\nHarga : " + price +
                "\nStok: " + stock + "\nDeskripsi : " + description + "\nUkuran : " 
                + ukuran + "\nPanas/Dingin : " + panasdingin;  
    }
    //Method Overriding
    @Override
    public double getDiskon() { 
        return price >= 15000 ? 0.05 : 0.0;
    };
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
