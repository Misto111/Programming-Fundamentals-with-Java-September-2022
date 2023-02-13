package lab14_Methods.samples;

import java.util.Scanner;

public class sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputline = scanner.nextLine();

        printData("Babatunde", "34");

    }
    public static void printData(String name, String age) {
        System.out.println(name);
        System.out.println(age);
    }
}
