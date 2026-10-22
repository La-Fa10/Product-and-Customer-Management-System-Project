/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
 */
package productcustomermanagement;

/* 
 * Students Name: Aseel Alghamdi, Layan Alswaat  
 * Group: 6 
 */
// Define the Product class. 
public class ProductData {

    // Declare variables for Product ID, name, and price. 
    private int ID;
    private String name;
    private double price;

    public ProductData() { // Default constructor (no parameters). 
    }

    // Constructor that initialize Product with given ID, name, and price. 
    public ProductData(int ID, String name, double price) {
        this.ID = ID; // Set Product ID. 
        this.name = name; // Set Product name. 
        this.price = price; // Set Product price. 
    }

    // Setter for product ID. 
    public void setID(int ID) {
        this.ID = ID; // Set ID. 
    }

    // Getter for product ID. 
    public int getID() {
        return ID; // Return ID. 
    }

    // Setter for product name. 
    public void setName(String name) {
        this.name = name; // Set name. 
    }

    // Getter for product name. 
    public String getName() {
        return name; // Return name. 
    }

    // Setter for product price. 
    public void setPrice(double price) {
        this.price = price; // Set price. 
    }

    // Getter for product price. 
    public double getPrice() {
        return price; // Return price. 
    }

    // Overridden toString method to return a formatted string with product details. 
    @Override
    public String toString() { // Start of toString method. 
        // Return Product details as a string. 
        return "Product Name : " + name + "\n"
                + "Price        : " + price + " Riyal\n"
                + "Product ID   : " + ID + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    } // End of toString method. 
} // End of Product class.