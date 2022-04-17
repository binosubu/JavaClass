package day13;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide which day is today: ");
        String today = scanner.nextLine();

        if(today.equalsIgnoreCase("sunday")){
            System.out.println("Momo");
        }
        else if(today.equalsIgnoreCase("monday")){
            System.out.println("Pizza");
        }
        else if(today.equalsIgnoreCase("tuesday")){
            System.out.println("Burger");
        }
        else if(today.equalsIgnoreCase("wednesday")){
            System.out.println("Rice");
        }
        else if(today.equalsIgnoreCase("thursday")){
            System.out.println("Pasta");
        }
        else if(today.equalsIgnoreCase("friday")){
            System.out.println("Buff");
        }
        else{
            System.out.println("Chicken");
        }
    }
}
