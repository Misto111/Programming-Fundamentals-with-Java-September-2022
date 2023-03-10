package ex31_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furnitureNames = new ArrayList<>();

        String regex = "(>{2})(?<furniture>[A-Za-z]+)(<{2})(?<price>[0-9]+\\.?[0-9]*)(!)(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);



        double totalSum = 0;

        String input = scanner.nextLine();


        while (!input.equals("Purchase")){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furnitureName = matcher.group("furniture"); //Sofa
                double price = Double.parseDouble(matcher.group("price")); //312.23
                int quantity = Integer.parseInt(matcher.group("quantity"));

               furnitureNames.add(furnitureName);
               double currentFurniturePrice = price * quantity; //платено за текущата мебел
                totalSum += currentFurniturePrice;

            }

          input = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
