package ex12_Arrays;

import java.util.Scanner;

public class p02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split("\\s+");
        String [] secondArr = scanner.nextLine().split("\\s+");

        for (String secondElement : secondArr) {

            for (String firstElement : firstArr) {

                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                    break;
                }

            }

        }

    }
}


