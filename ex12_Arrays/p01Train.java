package ex12_Arrays;

import java.util.Scanner;

public class p01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());

        int sumOfPeople = 0;

        int[] peopleArr = new int[countOfWagons];



        for (int i = 0; i < countOfWagons; i++) {

            int currentPeople = Integer.parseInt(scanner.nextLine());



            sumOfPeople += currentPeople;
            peopleArr[i] = currentPeople;

            System.out.print(peopleArr[i] + " ");




    }
        System.out.println();
        System.out.println(sumOfPeople);
}
}
