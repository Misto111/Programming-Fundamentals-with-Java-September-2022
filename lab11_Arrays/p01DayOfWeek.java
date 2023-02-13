package lab11_Arrays;

import java.util.Scanner;

public class p01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] daysArr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (dayNumber >= 1 && dayNumber <=7){

            System.out.println(daysArr[dayNumber - 1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}







