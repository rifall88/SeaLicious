/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project4;

/**
 *
 * @author Asus
 */
public class MenuItem {
    private String name; //modifier private
    private String category; //modifier private
    private int price; //modifier private
    private int stock; //modifier private
    private String description; //modifier private
    
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
     //Mendeklarasi mutator method
    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public void setDescription(String description){
        this.description = description;
    }
     //Mendeklarasi accessor method
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public int getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public String getDescription(){
        return description;
    }
}
