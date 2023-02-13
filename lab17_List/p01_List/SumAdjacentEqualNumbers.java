package lab17_List.p01_List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {


            double currentNum = numList.get(i);
            double nextNum = numList.get(i + 1);

            if (currentNum == nextNum) {
                numList.set(i, currentNum + nextNum);
                numList.remove(i + 1);

                i = -1;
            }


        }





        System.out.println(joinByDelimiter(numList, " "));


    }
    public static String joinByDelimiter (List<Double> list, String delimiter ) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {

            result += df.format(item) + delimiter;

        }
        return result;
    }

}


