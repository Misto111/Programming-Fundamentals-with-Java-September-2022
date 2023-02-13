package lab14_Methods;

import java.util.Scanner;

public class p04Calculations {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

            if (command.equals("add")) {
                printAdd(num1, num2);
            } else if (command.equals("multiply")) {
                printMultiply(num1, num2);
            } else if (command.equals("subtract")) {
                printSubtract(num1, num2);
            }else {
                printDivide(num1, num2);
            }

    }
    public static void printAdd (int num1, int num2) {

        int sumAdd = num1 + num2;
        System.out.println(sumAdd);


        }
        public static void printMultiply (int num1, int num2) {
          int sumMultiply = num1 * num2;
            System.out.println(sumMultiply);
        }
        public static void printSubtract (int num1, int num2) {
        int sumSubtract = num1 - num2;
            System.out.println(sumSubtract);
        }
        public static void printDivide (int num1, int num2) {
        int sumDivide = num1 / num2;
            System.out.println(sumDivide);
        }
    }


