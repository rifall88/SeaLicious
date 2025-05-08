/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project7;

/**
 *
 * @author Asus
 */
public abstract class MenuItem {
    protected String name; //modifier protected
    protected String category; //modifier protected
    protected int price; //modifier protected
    protected int stock; //modifier protected
    protected String description; //modifier protected
    
    //Membuat Constructor Dengan 5 Parameter (Overloading)
    public MenuItem(String name, String category, int price, int stock, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
    //Membuat Constructor Tanpa Parameter (Overloading)
    public MenuItem() {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
    //Membuat abstract method
    public abstract String displayInfo();
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
