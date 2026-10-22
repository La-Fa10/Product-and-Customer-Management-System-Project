/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
 */
package productcustomermanagement;

/* 
 * Students Name: Aseel Alghamdi, Layan Alswaat 
 * Group: 6 
 */
// Define the Organization class. 
public class OrganizationData {
    // Start of organization class. 

    // Declare variables for organization name, address, and ID. 
    private String name;
    private String address;
    private int ID;

    // Declaring arrays for storing products and customers. 
    private ProductData[] products;
    private CustomerData[] customers;

    public OrganizationData() {
        // Default constructor (no parameters). 
    }

    // Constructor that initializes values and sets array sizes for products and customers. 
    public OrganizationData(String name, String address, int ID, int numberOfProducts, int numberOfCustomers) {
        this.name = name; // set organization name. 
        this.address = address; // set organization address. 
        this.ID = ID; // set organization ID. 
        this.products = new ProductData[numberOfProducts]; // initialize product array. 
        this.customers = new CustomerData[numberOfCustomers]; // initialize customer array. 
    }

    // Setter for organization name. 
    public void setName(String name) {
        this.name = name; // Set name. 
    }

    // Getter for organization name. 
    public String getName() {
        return name; // Return name. 
    }

    // Setter for organization address. 
    public void setAddress(String address) {
        this.address = address; // Set address. 
    }

    // Getter for organization address. 
    public String getAddress() {
        return address; // Return address. 
    }

    // Setter for organization ID. 
    public void setID(int ID) {
        this.ID = ID; // Set ID. 
    }

    // Getter for organization ID. 
    public int getID() {
        return ID; // Return ID. 
    }

    // Setter for products array. 
    public void setProducts(ProductData[] products) {
        this.products = products; // Set products. 
    }

    // Getter for products array. 
    public ProductData[] getProducts() {
        return products; // Return products. 
    }

    // Setter for customers array. 
    public void setCustomers(CustomerData[] customers) {
        this.customers = customers; // Set customers. 
    }

    // Getter for customers array. 
    public CustomerData[] getCustomers() {
        return customers; // Return customers. 
    }

    // Override the toString method to return organization info as a string. 
    @Override
    public String toString() {
        String result = "********** Organization Summary **********\n";
        result += "Name       : " + name + "\n";
        result += "Address    : " + address + "\n";
        result += "ID         : " + ID + "\n";
        result += "Products   : " + (products != null ? products.length : 0) + "\n";
        result += "Customers  : " + (customers != null ? customers.length : 0) + "\n";
        result += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        return result;
    } // End of toString method. 
} // End of organization class.