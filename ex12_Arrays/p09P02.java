package ex12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class p09P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {


            if (command.contains("swap")) {


                int elementIndex1 = Integer.parseInt(command.split(" ")[1]);
                int elementIndex2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numArr[elementIndex1];
                int element2 = numArr[elementIndex2];

                numArr[elementIndex1] = element2;
                numArr[elementIndex2] = element1;


            } else if (command.contains("multiply")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int element1 = numArr[index1];
                int element2 = numArr[index2];

                int sum = element1 * element2;

                numArr[index1] = sum;

            } else if (command.contains("decrease")) {
                for (int i = 0; i < numArr.length; i++) {
                    numArr[i] = numArr[i] - 1;

                }


            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numArr.length; i++) {

            int currentNum = numArr[i];


            if ( i  == numArr.length - 1){

            System.out.print(currentNum + " ");


        }else {
                System.out.print(currentNum + ", ");
            }


        }


    }
}





