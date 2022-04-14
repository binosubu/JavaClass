import java.util.Scanner;

public class UserCLIInput {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Please enter any number you like: ");
        int userInput = scanner.nextInt();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // if we are using nextLine at the bottom then we have to create
        //separate scanner class for that object.
        //OR the next solution is that nextLine must be at first line, check below example.

        System.out.println( name + "entered " + userInput + " number.");
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter any number you like: ");
        int userInput = scanner.nextInt();

        System.out.println( name + " entered " + userInput + " number.");
    }
}
