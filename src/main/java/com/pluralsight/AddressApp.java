package com.pluralsight;

import java.util.Scanner;

public class AddressApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information:");
        System.out.print("Full name:");
        String name = scanner.nextLine();
        System.out.print("Billing Street:");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City:");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State:");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zip:");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street:");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City:");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State:");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip:");
        String shippingZip = scanner.nextLine();

        StringBuilder address = new StringBuilder();
        address.append(name).append("\n");
        address.append("\n");
        address.append("Billing address:\n");
        address.append(billingStreet).append("\n");
        address.append(billingCity);
        address.append(", ").append(billingState);
        address.append(" ").append(billingZip);

        address.append("\n");
        address.append("Shipping Address:\n");
        address.append(shippingStreet).append("\n");
        address.append(shippingCity);
        address.append(", ").append(shippingState);
        address.append(" ").append(shippingZip);

        String billingAddress = address.toString();
        System.out.println(billingAddress);

        scanner.close();
    }
}
