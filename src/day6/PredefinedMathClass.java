package day6;

public class PredefinedMathClass {
    public static void main(String[] args) {

        // Math -----> to view the Math class we have to click control on the math,
        // then math class will open in new tab

        double ceilValue = Math.ceil(4.9);
        System.out.println(ceilValue);

        double floorValue = Math.floor(4.9);
        System.out.println(floorValue);

        long roundValue = Math.round(4.9);
        System.out.println(roundValue);

        double randomValue = Math.random();
        System.out.println(Math.round(randomValue * 10));

    }
}

