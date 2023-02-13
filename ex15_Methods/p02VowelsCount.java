package ex15_Methods;

import java.util.Scanner;

public class p02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowels(text.toLowerCase());

    }

    public static void printVowels(String text) {


        int countVowels = 0;

        for (char symbol : text.toCharArray()) {


            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {

                countVowels ++;





            }
           ;

        }
        System.out.println(countVowels);

    }
}

