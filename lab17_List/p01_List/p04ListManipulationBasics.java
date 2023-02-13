package lab17_List.p01_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.contains("end")) {


            if (command.contains("Add")) {
                int indexForAdd = Integer.parseInt(command.split(" ")[1]);
                numList.add(numList.size(), indexForAdd);


            } else if (command.contains("Remove")) {
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numList.remove(Integer.valueOf(numberForRemove));




            } else if (command.contains("RemoveAt")) {
                int indexForRemove = Integer.parseInt(command.split(" ")[1]);
                numList.remove(indexForRemove);


            } else if (command.contains("Insert")) {
                int numberForInsert = Integer.parseInt(command.split(" ")[1]);
                int indexForInsert = Integer.parseInt(command.split(" ")[2]);

                numList.add(indexForInsert, numberForInsert);


            }


            command = scanner.nextLine();
        }

        System.out.println(numList);

    }
}
