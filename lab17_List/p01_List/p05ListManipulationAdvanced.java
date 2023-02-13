package lab17_List.p01_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {


            String[] separatedCommand = command.split("\\s+");

            switch (separatedCommand[0]) {

                case "Contains":
                    int containsNum = Integer.parseInt(separatedCommand[1]);

                    if (numList.contains(containsNum)) {
                        System.out.println("Yes");


                    } else {
                        System.out.println("No such number");


                    }

                    break;

                case "Print":

                    if (command.contains("even")) {

                        for (int i = 0; i < numList.size(); i++) {

                            if (numList.get(i) % 2 == 0) {
                                System.out.print(numList.get(i) + " ");


                            }


                        }

                    } else if (command.contains("odd")) {
                        for (int i = 0; i < numList.size(); i++) {

                            if (numList.get(i) % 2 != 0) {
                                System.out.print(numList.get(i) + " ");

                            }


                        }


                    }
                    System.out.println();

                    break;

                case "Get":

                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {

                        sum += numList.get(i);


                    }
                    System.out.println(sum);

                    break;

                case "Filter":
                    int activeNum = Integer.parseInt(separatedCommand[2]);

                    if (separatedCommand[1].equals("<")) {

                        for (int i = 0; i < numList.size(); i++) {

                            if (numList.get(i) < activeNum) {
                                System.out.print(numList.get(i) + " ");


                            }


                        }



                    } else if (separatedCommand[1].equals(">")) {

                        for (int i = 0; i < numList.size(); i++) {

                            if (numList.get(i) >activeNum) {
                                System.out.print(numList.get(i) + " ");
                            }

                        }

                    } else if (separatedCommand[1].equals(">=")) {
                        for (int i = 0; i < numList.size(); i++) {

                            if (numList.get(i) >= activeNum) {
                                System.out.print(numList.get(i) + " ");
                            }

                        }

                    } else if (separatedCommand[1].equals("<=")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) <= activeNum) {

                                System.out.print(numList.get(i) + " ");
                            }

                        }

                    }
                    System.out.println();

                    break;


            }
            command = scanner.nextLine();
        }
    }
}

