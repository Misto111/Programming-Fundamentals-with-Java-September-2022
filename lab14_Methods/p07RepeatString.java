package lab14_Methods;

import java.util.Scanner;

public class p07RepeatString {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String word = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());

        String result = wordCounter(counter, word);
        System.out.println(result);

    }
    public static String wordCounter(int count, String text) {
         String result = "";
        for (int i = 0; i < count; i++) {
            result += text;


        }
        return result;
    }
}
