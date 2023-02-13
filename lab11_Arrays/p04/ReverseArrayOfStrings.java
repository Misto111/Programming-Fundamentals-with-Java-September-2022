package lab11_Arrays.p04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int evenSum = 0;
            int oddSum = 0;


        for (int num : numArr) {

            if (num % 2 == 0) {
                evenSum += num;
            }else {
                oddSum += num;
            }






    }
        System.out.println(evenSum - oddSum);

}
}
