package lab33_ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            rateMap.put(plant, 0.0);

            plantRarityMap.putIfAbsent(plant, 0);

            plantRarityMap.put(plant, rarity);
        }
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Exhibition")) {
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];
            double value = 0;

            if (!plantRarityMap.containsKey(plant)){
                System.out.println("error");

            }else {
                switch (command) {
                    case "Rate" :
                        value = Double.parseDouble(tokens[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, value);
                        }else {
                            double newRate = (rateMap.get(plant) + value) / 2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update" :
                        value = Double.parseDouble(tokens[2]);
                        break;
                    case "Reset" :
                        break;
                }
            }


            inputLine = scanner.nextLine();
        }



    }
}
