package lab17_List.p01_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= (numList.size() -1) / 2  ; i++) {
            if (i == numList.size() - 1) {
                break;
            }

            int secondSum = (numList.get(i) + numList.get(numList.size() - 1));

            numList.set(i, secondSum);

            numList.remove(numList.size() - 1);



            //int firstNum = numList.get(i);
            //int secondNum = numList.size() - 1;
            //numList.set(i, firstNum + secondNum);


        }

        for (int num : numList)  {


        System.out.print(num + " ");

        }



    }
}

