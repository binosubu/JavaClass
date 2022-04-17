package day13;

public class ConditionalStatement {
    public static void main(String[] args) {

        int sales = 5;
        int target = 10;

        //Simple IF Statement
//        if (sales >= target){
//            String performance = "Satisfactory";
//            System.out.println("Congratulations !! you will get bonus of 100$.");
//        }
        String performance = "";

        if (sales >= target){
            performance = "Satisfactory";
            System.out.println("Congratulations !! you will get bonus of 100$.");
        }
        else {
            performance = "Not Satisfactory";
            System.out.println("Sorry, better luck next time.");
        }
    }
}
