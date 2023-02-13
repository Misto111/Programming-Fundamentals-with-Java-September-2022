package lab14_Methods;

import java.util.Scanner;

public class p05Orders {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String product = scanner.nextLine();
        int numberOfProduct = Integer.parseInt(scanner.nextLine());

         if (product.equals("coffee")) {
             printCoffee(numberOfProduct);
         } else if (product.equals("water")) {
             printWater(numberOfProduct);
         } else if (product.equals("coke")) {
             printCoke(numberOfProduct);
         } else if (product.equals("snacks")) {
             printSnacks(numberOfProduct);
         }
    }
    public static void printCoffee(int numberOfProduct) {
        System.out.println(numberOfProduct * 1.50);
    }
    public static void printWater(int numberOfProduct) {
        System.out.println(numberOfProduct * 1.00);
    }
    public static void printCoke(int numberOfProduct) {
        System.out.println(numberOfProduct * 1.40);
    }
    public static void printSnacks(int numberOfProduct) {
        System.out.println(numberOfProduct * 2.00);
    }
}
