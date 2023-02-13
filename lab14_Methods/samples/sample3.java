package lab14_Methods.samples;

import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printReceipt(scanner.nextLine());

    }
    public static void printReceipt(String text) {
        printHeader();
        printBody(text);
        printFooter();
    }

    public static void printHeader() {
        System.out.println("-----------");
    }
    public static void printBody(String text) {
        System.out.println(text);
    }
    public static  void printFooter() {
        System.out.println("**************");
    }
}
