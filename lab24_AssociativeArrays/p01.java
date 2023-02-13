package lab24_AssociativeArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p01 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double [] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
     }
}
