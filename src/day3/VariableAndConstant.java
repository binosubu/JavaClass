package day3;

public class VariableAndConstant {
    public static void main(String[] args) {
        String imageId = "fdjsfjeifj234342";
        imageId = "dlfkj";
        final String TITLE = "Some Title";
        // TITLE = "Changed Tittle";

        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        enum Size {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }

        int a = 4;
        int b = 5;
        int c = a + b;

        int x = 0;
        x += 2;     //x = x + 3;
        x -= 2;     //x = x - 3;
        x *= 2;     //x = x * 3;
        x /= 2;     //x = x / 3;
        System.out.println(x);
    }
}
