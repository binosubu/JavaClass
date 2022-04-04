package day6;

public class PredefinedMathClass {
    public static void main(String[] args) {

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

