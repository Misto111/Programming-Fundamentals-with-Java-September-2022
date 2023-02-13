package ex31_RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double totalSum = 0;


        String regex = "%(?<customer>[A-Z][a-z]*)%[^|%$.]*?<(?<product>\\w+)>[^|%$.]*?\\|(?<count>[0-9]+)\\|[^|%$.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";

        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){

            String customer = matcher.group("customer");
            String product = matcher.group("product");
            int count = Integer.parseInt(matcher.group("count"));
            double price = Double.parseDouble(matcher.group("price"));




            double currentSum = count * price;

            totalSum += currentSum;
                System.out.printf("%s: %s - %.2f%n", customer, product, currentSum );


            }

            input = scanner.nextLine();

        }

        System.out.printf("Total income: %.2f", totalSum);


    }


}

