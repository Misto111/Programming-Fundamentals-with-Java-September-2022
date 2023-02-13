package lab11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p06EqualArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diffNum = 0;
        boolean success = true;

        for (int i = 0; i < firstArr.length; i++) {
            int numFirstArr = firstArr[i];
            int numSecondArr = secondArr[i];

            if (numFirstArr == numSecondArr) {
                sum += numFirstArr;

            }else {
                diffNum = i;
                success = false;



                break;
            }



        }
        if (success) {
            System.out.printf("Arrays are identical. Sum: %d", sum );
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffNum);
        }
    }


}
