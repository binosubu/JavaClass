package day12;

import java.io.Console;
import java.util.Scanner;

public class ConsolePassword {
    public static void main(String[] args) {

        String userName, password;

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Please enter your name: ");
        userName = console.readLine();
        System.out.print("Enter your password: ");
        password = console.readPassword().toString();

        System.out.println(password);

        if (!password.equals("admin123")){
            System.out.println("You are not authentic user, Please try again!!!");
            System.exit(0); // to exit the code if password is wrong, won't go to next line.
        }

        System.out.println("Binod Maharjan");

    }
}
