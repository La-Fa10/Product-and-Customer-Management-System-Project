/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
 */
package productcustomermanagement;

/* 
 * Students Name: Aseel Alghamdi, Layan Alswaat 
 * Group: 6 
 */
// Class that represents a customer who receives services from the organization 
public class CustomerData {

    // Instance Variables 
    // These are private to follow the encapsulation rule 
    private String name;
    private int ID;
    private String address;
    private String mobile;
    private String email;

    // Default Constructor  
    // Initializes an empty customer object 
    // Useful when we want to create the object first, then set its values later using setters 
    public CustomerData() {
    }

    // Parameterized Constructor 
    // Initializes a customer object with full details 
    public CustomerData(String name, int ID, String address, String mobile, String email) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    // Setter and Getter for name  
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter for ID  
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    // Setter and Getter for address  
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Setter and Getter for mobile number 
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    // Setter and Getter for email  
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // Returns a readable summary of the customer's details. 
    // Automatically used when printing the object. 
    @Override
    public String toString() {
        return "Customer Name : " + name + "\n"
                + "Address       : " + address + "\n"
                + "ID            : " + ID + "\n"
                + "Email         : " + email + "\n"
                + "Mobile        : " + mobile;
    } // End of toString method. 
} // End of Customer class.