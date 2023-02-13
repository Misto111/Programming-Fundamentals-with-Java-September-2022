package regularMIdExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number - 1; i++) {


            String command = scanner.nextLine();

            String[] coma = command.split(" ");
            if (coma[0].equalsIgnoreCase("Remove")) {
                boolean isFirst = coma[1].equalsIgnoreCase("first");
                int numberCoffeeToRemove = Integer.parseInt(coma[2]);
                remove(isFirst, numberCoffeeToRemove, coffees);
            }

        }


    }


    static void include(String coffee, List<String> coffees) {
        coffees.add(coffee);

    }

    static void remove(boolean isFirst, int numbersOfCoffees, List<String> coffees) {
        if (isFirst) {
            for (int i = 0; i < numbersOfCoffees; i++) {
                coffees.remove(0);

            }

        } else {
            for (int i = 0; i < numbersOfCoffees; i++) {
                coffees.remove(coffees.size() - 1);

            }
        }
    }
}


