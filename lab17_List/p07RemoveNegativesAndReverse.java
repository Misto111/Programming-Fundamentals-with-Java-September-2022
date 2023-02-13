package lab17_List;

import java.util.*;
import java.util.stream.Collectors;

public class p07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

           numList.removeIf(n-> n < 0);

        Collections.reverse(numList);

        if (numList.isEmpty()) {

            System.out.println("empty");
        }else {
            System.out.println(numList.toString().replaceAll("[\\[\\],]",""));
        }
        }
    }

