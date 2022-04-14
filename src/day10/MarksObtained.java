package day10;

import java.util.Scanner;

public class MarksObtained {
    public static void main(String[] args) {
        String name;
        float mathMarks, scienceMarks, englishMarks, accountMarks, nepaliMarks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        name = scanner.nextLine();

        System.out.print("Enter your math marks: ");
        mathMarks = scanner.nextFloat();

        System.out.print("Enter your science marks: ");
        scienceMarks = scanner.nextFloat();

        System.out.print("Enter your english marks: ");
        englishMarks = scanner.nextFloat();

        System.out.print("Enter your account marks: ");
        accountMarks = scanner.nextFloat();

        System.out.print("Enter your nepali marks: ");
        nepaliMarks = scanner.nextFloat();

        float totalMarks = mathMarks + scienceMarks + englishMarks + accountMarks + nepaliMarks;
        float percentTotal = totalMarks/5;
        System.out.println("The total marks obtained by " + name + " is " + totalMarks + " and percent obtained is " + percentTotal + "%");






    }
}
