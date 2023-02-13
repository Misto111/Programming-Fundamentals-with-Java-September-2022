package ex5;

import java.util.Scanner;

public class p04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNumber; i <= endNumber ; i++) {
            int numbCounter = i;
            sum+=numbCounter;
            System.out.print(numbCounter + " ");



        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
