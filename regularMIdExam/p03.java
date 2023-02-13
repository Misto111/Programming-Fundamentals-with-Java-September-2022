package regularMIdExam;

import org.w3c.dom.DOMStringList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.next().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.contains("Add")){
                String index = command.split(" ")[2];
                stringList.get(Integer.parseInt(index));



            }else if (command.contains("Remove")){
                String index2 = command.split(" ")[2];
                stringList.remove(index2);




            }else if (command.contains("Bonus phone")){
                String index = command.split(" ")[0];
                String index2 = command.split(" ")[2];
                if (command.equals(index)){
                    stringList.set(0, index2);
                }


            }else if (command.contains("Last")){
                String index = command.split(" ")[2];
                if (command.equals(index)){
                    stringList.add(index);
                }


            }


            command = scanner.nextLine();
        }
        System.out.println(stringList);
    }
}
