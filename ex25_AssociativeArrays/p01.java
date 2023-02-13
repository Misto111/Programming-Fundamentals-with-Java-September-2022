package ex25_AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (!countMap.containsKey(symbol)) {

                countMap.put(symbol, 1);
            }
            else {
                int countSymbol = countMap.get(symbol);

                countMap.put(symbol, countSymbol + 1);

            }
        }
        countMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
