package day3;

public class VariableAndConstant {
    public static void main(String[] args) {
        String imageId = "fdjsfjeifj234342";
        imageId = "dlfkj";
        final String TITLE = "Fixed Title";
        // TITLE = "cannot be changed once set into final String";

        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }

        int a = 4;
        int b = 5;
        int calc = (a+b)*(a-b);
        System.out.println("Final ans is " + calc);


        int x = 10;
        x += 2;     //x = x + 2;
        x -= 2;     //x = x - 2;
        x *= 2;     //x = x * 2;
        x /= 2;     //x = x / 2;
        System.out.println(x);
    }
}
