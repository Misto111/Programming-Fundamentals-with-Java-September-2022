package ex15_Methods.p05;

import java.util.Scanner;

public class p06MiddleCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);

    }

    public static void printMiddleCharacters (String text) {

        if (text.length() % 2 == 0) {
            char symbol1 = text.charAt((text.length() / 2) - 1);
            char symbol2 = text.charAt(text.length() / 2);
            System.out.print(symbol1);
            System.out.print(symbol2);
        }else {
            char symbol = text.charAt(text.length() / 2);
            System.out.println(symbol);
        }
    }



    }



