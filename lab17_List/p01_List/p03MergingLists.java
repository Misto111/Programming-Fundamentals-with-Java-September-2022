package lab17_List.p01_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumber1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listNumber2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergingList = new ArrayList<>();

        int minSize = Math.min(listNumber1.size(), listNumber2.size());

            for (int i = 0; i < minSize; i++) {

                mergingList.add(listNumber1.get(i));
                mergingList.add(listNumber2.get(i));



                }
                    if (listNumber1.size() > listNumber2.size()) {
                        mergingList.addAll(listNumber1.subList(minSize, listNumber1.size()));
                    } else if (listNumber2.size() > listNumber1.size()) {

                        mergingList.addAll(listNumber2.subList(minSize, listNumber2.size()));

                    }
        //for (int number : mergingList) {

            //System.out.print(number + " ");
        System.out.println(mergingList.toString().replaceAll("[\\[\\],]", ""));

        }

    }








