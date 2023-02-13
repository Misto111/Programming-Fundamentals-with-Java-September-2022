package ex12_Arrays;

import java.util.Scanner;

public class p03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int rows = Integer.parseInt(scanner.nextLine());


       String[] firstArr = new String[rows];
       String[] secondArr = new String[rows];


        for (int i = 1; i <= rows; i++) {

            String [] numbers = scanner.nextLine().split("\\s+");

            String firstNumber = numbers[0];
            String secondNumber = numbers[1];
            if (i % 2 == 0) {

                firstArr[i - 1] = secondNumber;
                secondArr[i -1] = firstNumber;
            }else {
                firstArr[i - 1] = firstNumber;
                secondArr[i - 1] = secondNumber;
            }



            }
        System.out.print(String.join(" ", firstArr));
        System.out.println();
        System.out.print(String.join(" ", secondArr));




        }


    }

