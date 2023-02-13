package ex18_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {


            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
            } else if (command.contains("Insert")) {

                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, numberToInsert);

            } else if (command.contains("Remove")) {

                int indexForRemove = Integer.parseInt(command.split(" ")[1]);

                numbers.remove(indexForRemove);




            } else if (command.contains("Shift left")) {

                int countShiftLeft = Integer.parseInt(command.split(" ")[2]);

                for (int time = 1; time <= countShiftLeft ; time++) {

                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);

                }


            } else if (command.contains("Shift right")) {

                int countShiftRight = Integer.parseInt(command.split(" ")[2]);

                for (int time = 1; time <= countShiftRight ; time++) {

                    int lastNumber = numbers.get(numbers.size() - 1);



                }



            }
            command = scanner.nextLine();

        }
    }

}
