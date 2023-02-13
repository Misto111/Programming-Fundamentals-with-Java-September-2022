package lab24_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo_iterateMap_getKey_getValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> fruitMap = new LinkedHashMap<>();

        fruitMap.put("apple", 1.60);
        fruitMap.put("banana", 3.80);


        for (Map.Entry<String, Double> entry  : fruitMap.entrySet()) {

           String currentKey = entry.getKey();
           double currentValue = entry.getValue();

            System.out.printf("%s - %f%n", currentKey, currentValue);

        }

    }
}
