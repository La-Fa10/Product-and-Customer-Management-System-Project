/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
 */
package productcustomermanagement;

import java.util.Scanner;

/* 
 * Students Name: Aseel Alghamdi, Layan Alswaat 
 * Group: 6 
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // A scanner object for taking information from the user 
        Scanner input = new Scanner(System.in);

        // Organization Data 
        String orgName = "Tuwaiq Academy"; // Set the organization's name 
        String orgAddress = "Riyadh"; // Set the organization's address 
        int orgID = 1001; // Set the organization's ID 

        // Display a welcome message and the organization info 
        System.out.println("********** Welcome to " + orgName + " **********\n");

        // Print organization info 
        System.out.println("********** Organization Data **********");
        System.out.println("Name    : " + orgName); // Print Name 
        System.out.println("Address : " + orgAddress); // Print Address 
        System.out.println("ID      : " + orgID); // Print ID 
        System.out.println("-----------------------------------------\n");

        // Ask how many products the customer wants to order 
        System.out.println("How many products would you like to order?");
        int numProducts = input.nextInt(); // Read number of product  
        input.nextLine(); // to read a whole line from the user until the user presses Enter 

        // Create an empty array of a product objects based on user input ( to store product object ) 
        ProductData[] orderedProducts = new ProductData[numProducts];

        // Input product details 
        System.out.println("\n********** Product Data **********");
        // loop to collect product data from the user 
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter Product " + (i + 1) + " name:"); // We use (i + 1) to display product numbers starting from 1 instead of 0 
            // because arrays start at index 0 but it's more natural for users to see counting from 1. 
            String pname = input.nextLine(); // Read product name (can include spaces) 

            System.out.println("Enter Product " + (i + 1) + " price:");
            double pprice = input.nextDouble(); // input product Price  
            input.nextLine(); // Reads a full line from user input (until Enter is pressed) 

            System.out.println("Enter Product " + (i + 1) + " ID:");
            int pid = input.nextInt(); // input product id 
            input.nextLine(); // Reads a full line from user input (until Enter is pressed) 

            // Temporary array used to store all product objects entered by the user. 
            // Each product will be created and placed into this array before being sent to the Organization. 
            orderedProducts[i] = new ProductData(pid, pname, pprice);
        }

        // Collect customer info 
        System.out.println("\n********** Customer Data **********");
        System.out.println("Enter your name:");
        String cname = input.nextLine(); // Read customer name 

        System.out.println("Enter your address:");
        String caddress = input.nextLine(); // Read customer address 

        System.out.println("Enter your ID:");
        int cid = input.nextInt(); // Read customer ID 
        input.nextLine(); // Reads a full line from user input (until Enter is pressed) 

        System.out.println("Enter your email:");
        String cemail = input.nextLine(); // Read customer email 

        System.out.println("Enter your mobile:");
        String cmobile = input.nextLine(); // Read customer mobile number 

        // Create a customer object using the collected data
        CustomerData customer = new CustomerData(cname, cid, caddress, cmobile, cemail);

        // create the organization object with correct product and customer sizes 
        OrganizationData tuwaiq = new OrganizationData(orgName, orgAddress, orgID, numProducts, 1);
        // Set the products and customers into the organization object 
        tuwaiq.setProducts(orderedProducts); // Store product list in the organization 
        tuwaiq.setCustomers(new CustomerData[]{customer}); // Store customer as array 

        // Final Output : Show order summary 
        System.out.println("\n=========================================");
        System.out.println(">>> Order Summary");
        System.out.println("-----------------------------------------");

        // Show organization info with counts using toString() 
        System.out.println(tuwaiq);

        System.out.println("\n>>> Customer Information:");
        System.out.println("-----------------------------------------");
        System.out.println(customer); // Print customer details using toString() 

        System.out.println("\n>>> Ordered Products:");
        System.out.println("-----------------------------------------");

        // for loop to print all products in the array one by one 
        for (int i = 0; i < orderedProducts.length; i++) {
            System.out.println(orderedProducts[i]); // Print each product 
            System.out.println();
        }

        System.out.println("Thank you for shopping with " + orgName + "!");
        System.out.println("=========================================");

        input.close(); // Close the scanner after all inputs are done 
    }
}