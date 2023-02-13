package lab24_AssociativeArrays;

import java.util.HashMap;
import java.util.Scanner;

public class demo_containsKey_containsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> airplanesMap = new HashMap<>();

        airplanesMap.put("Boeing 737", 130);
        airplanesMap.put("Airbus A320", 265);

        if (airplanesMap.containsKey("Boeing 737")) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (airplanesMap.containsValue(130)) {
            System.out.println("Many people");
        }


    }
}



