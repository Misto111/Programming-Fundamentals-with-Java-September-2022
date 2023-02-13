package RegularFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02task02 {


        public static void main(String[] args) {
            String regex = "([\\$|\\%])(?<name>[A-Z][a-z]+)(\\1)\\: \\[(?<numbers1>[0-9]+)\\]\\|\\[(?<numbers2>[0-9]+)\\]\\|\\[(?<numbers3>[0-9]+)\\]\\|";

            Scanner scanner = new Scanner(System.in);


            int counter = Integer.parseInt(scanner.nextLine());
            String s = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);

            for (int i = 0; i < counter ; i++) {


                while (matcher.find()){

                   String name = matcher.group("name");

                    char numbers1 = (char)Integer.parseInt(matcher.group("numbers1"));
                    char numbers2 = (char)Integer.parseInt(matcher.group("numbers2"));
                    char numbers3 = (char)Integer.parseInt(matcher.group("numbers3"));


                    System.out.println(name +": " +numbers1 +numbers2 +numbers3);

                    if (name.equals(s)){
                    System.out.println("Valid message not found!");

                }





                }






            }



        }
}





