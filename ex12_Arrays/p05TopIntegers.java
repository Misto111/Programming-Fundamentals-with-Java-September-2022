package ex12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int [] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
          int [] biggerNum = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {

            int firstNum = numArr[i];

            if (i == numArr.length - 1) {

                System.out.print(firstNum + " ");
                break;

            }
            boolean isTop = false;
            for (int j = i + 1; j < numArr.length; j++) {

                int nextNum = numArr[j];

                if (firstNum > nextNum) {

                    isTop  = true;
                }else {
                    isTop = false;
                    break;
                }



                
            }
            if (isTop) {
                System.out.print(firstNum + " ");

            }

            }


        }

    }

