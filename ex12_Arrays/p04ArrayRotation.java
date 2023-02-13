package ex12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfRotation; i++) {

            int firstNum = numArr[0];


            for (int j = 0; j < numArr.length - 1; j++) {
                numArr[j] = numArr[j + 1];


            }
            numArr[numArr.length - 1] = firstNum;


        }
        for (int number : numArr) {


            System.out.print(number + " ");

        }
    }
}
