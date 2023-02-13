package lab11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
             int sum = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] % 2 == 0) {
                sum += numArray[i];


            }


        }
        System.out.println(sum);
    }

}
