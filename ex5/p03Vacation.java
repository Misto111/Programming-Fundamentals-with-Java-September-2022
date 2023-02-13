package ex5;

import java.util.Scanner;

public class p03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String typeDay = scanner.nextLine();

        double price = 0;

        if (typeDay.equals("Friday")) {
            if (typePeople.equals("Students")) {
                price = 8.45;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (typePeople.equals("Business")) {
                price = 10.90;
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
            } else if (typePeople.equals("Regular")) {
                price = 15;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }
            }

        } else if (typeDay.equals("Saturday")) {
            if (typePeople.equals("Students")) {
                price = 9.80;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (typePeople.equals("Business")) {
                price = 15.60;
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
            } else if (typePeople.equals("Regular")) {
                price = 20;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }

            }

        } else if (typeDay.equals("Sunday")) {
            if (typePeople.equals("Students")) {
                price = 10.46;
                if (numberOfPeople >= 30) {
                    price = price - (price * 0.15);
                }
            } else if (typePeople.equals("Business")) {
                price = 16;
                if (numberOfPeople >= 100) {
                    numberOfPeople -= 10;
                }
            } else if (typePeople.equals("Regular")) {
                price = 22.5;
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    price = price - (price * 0.05);
                }
            }
        }
        double totalPrice = numberOfPeople * price;
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
