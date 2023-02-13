package regularMIdExam;

import java.net.DatagramPacket;
import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());

        String nameOfCity = scanner.nextLine();

        double ownersIncome = Double.parseDouble(scanner.nextLine());
        double ownersExpenses = Double.parseDouble(scanner.nextLine());

        double totalProfit = 0;

        for (int i = 0; i < nameOfCity.length(); i++) {

        if (numberOfCities % 3 == 0) {

            ownersIncome = ownersIncome- (ownersIncome* 0.5);
            totalProfit += ownersIncome;


        } else if (numberOfCities % 5 == 0) {
                ownersIncome = ownersIncome - (ownersIncome * 0.1);
                totalProfit += ownersIncome;

            }
            System.out.printf("In %s Burger Bus earned %.2f leva.", nameOfCity, ownersIncome);
            System.out.println();


        }
        System.out.printf("Burger Bus total profit: %.2f leva", totalProfit);


    }
}

