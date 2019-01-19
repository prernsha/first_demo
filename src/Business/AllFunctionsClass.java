/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class AllFunctionsClass {
    
    
    Scanner scanner= new Scanner(System.in);//To read input from the user in console
    
    public static void main (String [] args){
        
        //Prepare a product object
        Product product = new Product();
        AllFunctionsClass function = new AllFunctionsClass(); // Instance of this class in order to call the non static methods
        function.GetInput(product);// To call the non static Get Input method
        
        function.DisplayInfo(product); // To call the non static display Info method
        function.UpdateInfo(product); // To call the non static Update Info method
        
       
    }
     
    public  void GetInput(Product product)
    {
              
        // User to input Product Details
        System.out.println("Create Product");
        System.out.println("*************************************************");
        System.out.println("Enter product name--");
        String productName = scanner.nextLine();
        product.setProductName(productName);
        
        System.out.println("Enter product price--");
        
        //Initialize variable for exception handling
        boolean value=true;
        // Input Mismatch Exxception Handling
        while(value){
        try{
            System.out.println("Please enter a number");
            float price = scanner.nextFloat();
            product.setPrice(price);
            break;
        }
        catch(Exception ex)
        {
          System.out.println("Error in parsing the Price");
            scanner.next();
           
        }
        
        }   
        
        System.out.println("Enter the availability number of the product");
        // Input Mismatch Exxception Handling
        while(value)
        {
        try {
            
            System.out.println("Please enter a number");
            int availNum = scanner.nextInt();
            product.setAvailNum(availNum);
            break;
        }
        catch (Exception ex){
            System.out.println("Error in parsing the Availability Number");
            scanner.next();
        }
        }
        
        System.out.println("Enter Product's Description--");
        String description= scanner.next();
        product.setDescription(description);
        
        System.out.println("******************************************************"); 
        
        // User input Supplier Details
               
        System.out.println("Enter suppliers name--");
        
        String supplierName= scanner.next();
        product.getSupplier().setSupplierName(supplierName);
        
        System.out.println("Enter suppliers product--");
        String supplierProduct= scanner.next();
        product.getSupplier().setSupplierProduct(supplierProduct);
        
        System.out.println("Enter suppliers product quantity--");
        // Input Mismatch Exxception Handling
        while(value)
        {
        try{
            System.out.println("Please enter a number");
        int supplierQuantity= scanner.nextInt();
        product.getSupplier().setSupplierQuantity(supplierQuantity);
        break;
        }
        catch (Exception ex)
        {
            System.out.println("Error in parsing the Price");
            scanner.next();
        }
        }
        
        System.out.println("Enter product description of supplier--");
        String supplierDescription= scanner.next();
        product.getSupplier().setSupplierDescription(supplierDescription);
                
        System.out.println("*************************************************");
        
    }
    
    public  void DisplayInfo(Product product)
    {
        //Display Product Details
        System.out.println("****************************************************");
        System.out.println("Product Information");
        System.out.println("****************************************************");
        System.out.println("Product name: " +product.getProductName());
        System.out.println("Product price: " +product.getPrice());
        System.out.println("Product availability number is: " +product.getAvailNum());
        System.out.println("Product description is: " +product.getDescription());
        
        System.out.println("*****************************************************");
      
        //Display Supplier Details
        System.out.println("****************************************************");
        System.out.println("Supplier Information");
        System.out.println("****************************************************");
        System.out.println("Supplier's name: " +product.getSupplier().getSupplierName());
        System.out.println("Supplier's product name : " +product.getSupplier().getSupplierProduct());
        System.out.println("Supplier's Quantity of product: " +product.getSupplier().getSupplierQuantity());
        System.out.println("Supplier's description of Product: " +product.getSupplier().getSupplierDescription());
        
        System.out.println("******************************************************"); 
        
    }
    
    public void UpdateInfo (Product product)
            
    {
        int choice=0; //Function global variable choice declared
        
        while( choice != 5){    
            System.out.println("1--> Update Product Field Details");
            System.out.println("2--> Update Supplier Field Details ");
            System.out.println("3--> Update All Fields for Product ");
            System.out.println("4--> Update All Fields for Supplier");
            System.out.println("5 --> Exit");
            System.out.println("Enter Your choice:");
            System.out.println("******************************************************");
            
            //Desclaring and initializing variable for Input mismatch exxception handling
            boolean value=true;
            choice = scanner.nextInt();
            
            
            while (choice !=5)
            {
                if (choice ==1)  
                {
                   //Update selected fields
                    System.out.println("******************************************************");
                    System.out.println("1 --> Update product name ");
                    System.out.println("2 --> Update Product price ");
                    System.out.println("3 --> Update avilability number");
                    System.out.println("4 --> Update Product description");
                    System.out.println("5 --> Exit");
                    System.out.println("Enter Your choice:");
                    System.out.println("******************************************************");
                    
                    int userInput = scanner.nextInt();
                    
                    while (userInput !=5)
                    {  
                       if (userInput ==1)
                               {
                                System.out.println("Enter new product name");
                                String updateName= scanner.next();
                                product.setProductName(updateName);
                                System.out.println("******************************************************");
                                
                                break;
                                }
                                           
                       else if (userInput ==2)
                               {
                                   
                                System.out.println("Enter new product price");
                                // Input Mismatch Exxception Handling
                                 while(value)
                                 {
                                try{
                                    System.out.println("Please enter a number");
                                    float updatePrice= scanner.nextFloat();
                                    product.setPrice(updatePrice);
                                    break;
                                }
                                catch (Exception ex)
                                 {
                                 System.out.println("Error in parsing the Price");
                                    scanner.next();
                                 }
                                 }
                                
                                System.out.println("******************************************************");  
                               
                                break;
                                
                               }
                        else if (userInput ==3)
                               {
                                   
                                System.out.println("Enter new product availability number");
                                // Input Mismatch Exxception Handling
                                 while(value)
                                 {
                                try{
                                    System.out.println("Please enter a number");
                                    int updateAvailNum= scanner.nextInt();
                                    product.setAvailNum(updateAvailNum);
                                    break;
                                }
                                catch (Exception ex)
                                 {
                                 System.out.println("Error in parsing the availability number");
                                    scanner.next();
                                 }
                                 }
                                System.out.println("******************************************************");
                                
                                break;
                               }
                                            
                            else if (userInput ==4)
                               {
                                   
                                System.out.println("Enter new Product description");
                                String updateDesc= scanner.next();
                                product.setDescription(updateDesc);
                                System.out.println("******************************************************");
                                
                                  break;                             
                               }
                            else {System.out.println("Please enter choice");
                                break;
                            }
                       
                    }      
                   break;
                }
                
                else if (choice ==2)
                {
                    
                    //Update individual fields
                    System.out.println("******************************************************");
                    System.out.println("1 --> Update Supplier name");
                    System.out.println("2 --> Update Suppliers product ");
                    System.out.println("3 --> Update suppliers product available quantity");
                    System.out.println("4 --> Update Suppliers product description");
                    System.out.println("5 --> Exit ");
                    System.out.println("Enter Your choice:");
                    System.out.println("******************************************************");
                    
                    int input = scanner.nextInt();
                    
                    while (input != 5)
                    {  
                       if (input ==1)
                               {
                                System.out.println("Enter new Supplier name");
                                String updateSupplierName= scanner.next();
                                product.getSupplier().setSupplierName(updateSupplierName);
                                                               
                                break; 
                               }
                                              
                       else if (input ==2)
                               {
                                   
                                System.out.println("Enter Suppliers new product");
                                String updateSupplierProduct= scanner.next();
                                product.getSupplier().setSupplierProduct(updateSupplierProduct);
                                                              
                                 break;
                               }
                       
                       else if (input ==3)
                               {
                                   
                                System.out.println("Enter suppliers products new quantity ");
                                // Input Mismatch Exception Handling
                                 while(value)
                                 {
                                try{
                                    System.out.println("Please enter a number");
                                    int updateSupplierAvailNum= scanner.nextInt();
                                    product.getSupplier().setSupplierQuantity(updateSupplierAvailNum);
                                    break;
                                   }
                                catch (Exception ex)
                                 {
                                 System.out.println("Error in parsing the quantity");
                                    scanner.next();
                                 }
                                 }
                                                                
                                 break;
                                
                               }
                                            
                       else if (input ==4);
                               {
                                   
                                System.out.println("Enter Suppliers new product description");
                                String updateSupplierDesc= scanner.next();
                                product.getSupplier().setSupplierDescription(updateSupplierDesc);
                                                                
                                break;
                                
                               }
                               
                    }   
                    break;
               }
               
                else if (choice==3)
                {
                    // User to input Product Details to update them
                System.out.println("Update Product Information");
                System.out.println("******************************************************");
                
                System.out.println("Enter new product name");
                String newName= scanner.next();
                product.setProductName(newName);

                System.out.println("Enter new product price");
                // Input Mismatch Exception Handling
                while(value)
                {
                try{
                    System.out.println("Please enter a number");
                    float newPrice= scanner.nextFloat();
                    product.setPrice(newPrice);
                    break;
                }
                catch (Exception ex)
                {
                    System.out.println("Error in parsing the quantity");
                    scanner.next();
                }
                }

                System.out.println("Enter  availability number of the product");
                // Input Mismatch Exception Handling
                while(value)
                {
                try{
                    System.out.println("Please enter a number");
                    int newAvailNum = scanner.nextInt();
                    product.setAvailNum(newAvailNum);
                    break;
                }
                catch (Exception ex)
                {
                    System.out.println("Error in parsing the availability number");
                    scanner.next();
                }
                }
                
                System.out.println("Enter Product's Description");
                String newDesc= scanner.next();
                product.setDescription(newDesc);

                System.out.println("******************************************************");
                
                break;
                
                }
                
               else if (choice==4)
                   
               {
                    System.out.println("Update Supplier Information");
                    System.out.println("******************************************************");
        
                    System.out.println("Enter supplier's name");
                    String supplierNewName= scanner.next();
                    product.getSupplier().setSupplierName(supplierNewName);

                    System.out.println("Enter supplier's product ");
                    String supplierProductName= scanner.next();
                    product.getSupplier().setSupplierProduct(supplierProductName);

                    System.out.println("Enter quantity of product available with supplier");
                    // Input Mismatch Exception Handling
                    while(value)
                    {
                    try{
                    System.out.println("Please enter a number");
                    int supplierAvailNum = scanner.nextInt();
                    product.getSupplier().setSupplierQuantity(supplierAvailNum);
                    break;
                     }
                    catch (Exception ex)
                     {
                        System.out.println("Error in parsing the quantity");
                        scanner.next();
                     }
                     }

                    System.out.println("Enter description of the product");
                    String supplierNewDesc= scanner.next();
                    product.getSupplier().setSupplierDescription(supplierNewDesc);

                     System.out.println("******************************************************");
                     break;
               }
           } 
          //Call the display Report Method  
         DisplayInfo(product);  
    }
    }
}

