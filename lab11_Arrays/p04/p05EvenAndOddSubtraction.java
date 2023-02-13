package lab11_Arrays.p04;

import java.util.Arrays;
import java.util.Scanner;

public class p05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < numbers.length; i++) {


            if (numbers[i] % 2 == 0) {

                evenSum += numbers[i];
            }else {
                oddSum += numbers[i];

            }



        }
        int allSum = evenSum - oddSum;
        System.out.print(allSum);



    }

}
