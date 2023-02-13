package ex25_AssociativeArrays;

import java.util.*;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int numbersOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int student = 1; student <=numbersOfStudents ; student++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(studentName)) {

                studentsGrade.put(studentName, new ArrayList<>());
            }

            studentsGrade.get(studentName).add(grade);

        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            List <Double> gradeList = entry.getValue();

            String name = entry.getKey();

            double averageSum = getAverageSum(gradeList);
            if (averageSum >= 4.50){
                averageGrade.put(name, averageSum);
            }
        }
        averageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));


    }

    private static double getAverageSum(List<Double> gradeList) {

        double sumGrade = 0;
        for (double grade : gradeList) {

            sumGrade += grade;


        }
        return  sumGrade / gradeList.size();
    }

}

