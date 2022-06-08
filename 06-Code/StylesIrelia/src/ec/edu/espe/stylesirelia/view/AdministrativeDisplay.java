/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stylesirelia.view;

import ec.edu.espe.stylesirelia.model.Customer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 * user name: espe_smc
 * clave mongodb atlas R6cjoel2019
 * 
 */
public class AdministrativeDisplay {

    public static void main(String[] args) {
        System.out.println("System of Styles Irelia");

        ArrayList<Customer> customers;
        int option;
        int customerCount;
        int productCount;
        int number;
        String appointment;
        String address;
        String product;
        float cost;
        String expiration;
        int stock;
        String nameStylist;
        int numberStylist;
        int paymentStylist;
        int adress;
        int price;
        float payment;
        String nameService;
        Scanner textInput;
        boolean exit;

        exit = false;
        customers = new ArrayList<>();
        textInput = new Scanner(System.in);
        customerCount = 0;
        productCount = 0;

        while (!exit) {
            System.out.println("Welcome to system Styles by Irelia");
            System.out.println("This is a options");
            System.out.println("1. Add a new customer");
            System.out.println("2. Add a new product");
            System.out.println("3. Add a new Service");
            System.out.println("4. add a new Stylist");
            System.out.println("5. Add a new Suppplier");
            System.out.println("6. Add a new Turn");
            System.out.println("7. exit");

            try {
                System.out.println("Write the one option: ");
                option = textInput.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("You have selected option 1");
                        String name;
                        System.out.println("Write the customer name: ");
                        name = textInput.next();
                        System.out.println("Write the number of the customer: ");
                        number = textInput.nextInt();
                        System.out.println("Enter the date of the next appointment with the next structure");
                        System.out.println("Day/Month/Hour-Minutes");
                        System.out.println("Example: 19/April/10:30");
                        appointment = textInput.next();
                        System.out.println("Enter the address of the customer");
                        address = textInput.next();
                        customers.add(customerCount, new Customer(name, number, false, appointment, address));
                        customerCount++;
                        break;
                    case 2:
                        System.out.println("You have selected option 2");
                        System.out.println("what is the name of the product?");
                        product = textInput.next();
                        System.out.println("what is the cost of the product?");
                        cost = textInput.nextInt();
                        System.out.println("what is the date of the expiration?");
                        expiration = textInput.next();
                        System.out.println("what is the stock of the product?");
                        stock = textInput.nextInt();
                    case 3:
                        System.out.println("You have selected option 3");
                        System.out.println("what is the Service: ?");
                        nameService = textInput.next();
                        System.out.println("what is the price of the service?");
                        price = textInput.nextInt();
                        System.out.println("Do you have pending Payment?");
                        payment = textInput.nextInt();
                        break;
                    case 7:
                        exit = true;
                        break;
                    case 4:
                        System.out.println("You have selected option 4");
                        System.out.println("Write the Stylist name: ");
                        nameStylist = textInput.next();
                        System.out.println("Write the number of the Stylist: ");
                        numberStylist = textInput.nextInt();
                        System.out.println("Write the pending payment with the Stylist: ");
                        paymentStylist = textInput.nextInt();
                        System.out.println("What is the address of the stylist? ");
                        adress = textInput.nextInt();
                        break;
                    case 5:
                        System.out.println("You have selected option 5");
                        String supplier;
                        int numberSupplier;
                       
                        System.out.println("Write the supplier name: ");
                        supplier = textInput.next();
                        System.out.println("Write the number of the Supplier: ");
                        numberSupplier = textInput.nextInt();
                        System.out.println("Write the pending payment with the supplier");
                        payment = textInput.nextInt();
                        break;
                    default:
                        System.out.println("Only numbers 1 ... 7");
                        

                }
            } catch (Exception e) {
                System.out.println("Only enter the numbers");
                textInput.next();
            }

            for (Customer customer : customers) {
                System.out.println(customers);
            }

        }

    }

}