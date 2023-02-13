package ex12_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String [] splitCommand = command.split("\\s+");

            switch (splitCommand[0]) {

                case "Add" :
                    int numberForAdd = Integer.parseInt(splitCommand[1]);
                    numList.add(numList.size(), numberForAdd);
                    break;

                case "Remove" :
                    int numberForRemove = Integer.parseInt(splitCommand[1]);
                    numList.remove(Integer.valueOf(numberForRemove));
                    break;

                case "RemoveAt" :
                    int indexForRemove = Integer.parseInt(splitCommand[1]);
                    numList.remove(indexForRemove);
                    break;

                case "Insert" :
                    int numberForInsert = Integer.parseInt(splitCommand[1]);
                    int indexForInsert = Integer.parseInt(splitCommand[2]);
                    numList.add(indexForInsert, numberForInsert);
                    break;

            }

            command = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
