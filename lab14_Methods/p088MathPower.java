package lab14_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p088MathPower {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double number = Integer.parseInt(scanner.nextLine());
        int powerOfNumber = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, powerOfNumber);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));


    }
    public static double mathPower(double number, int powerOfNumber) {
        double result = 1;
        for (int i = 1; i <= powerOfNumber; i++) {
           result = result * number;
        }

        return result;
    }

}
