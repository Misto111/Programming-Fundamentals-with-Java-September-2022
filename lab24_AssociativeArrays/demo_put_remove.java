package lab24_AssociativeArrays;

import java.util.HashMap;
import java.util.Scanner;

public class demo_put_remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> airplanesMap = new HashMap<>();

        airplanesMap.put("Boeing 737", 130);
        airplanesMap.put("Airbus A320", 265);
        airplanesMap.put("Boeing 737", 180);

        //airplanesMap.remove("Boeing 737");

        System.out.println(airplanesMap);


    }
}


