package ex5;

import java.util.Scanner;

public class p11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCounter = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGameCounter / 2;
        int countMouse = lostGameCounter / 3;
        int countKeyboards = lostGameCounter / 6;
        int countDisplay = lostGameCounter / 12;

        double finalSum = (countHeadset * headsetPrice) + (countMouse * mousePrice) + (countKeyboards * keyboardPrice) + (countDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", finalSum);
    }
}
