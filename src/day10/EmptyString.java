package day10;

public class EmptyString {

    public static void main(String[] args) {

        String emptyString = "";
        String emptyString1 = "        ";

        System.out.println(emptyString.length());
        System.out.println(emptyString1.length());
        System.out.println(emptyString1.trim().length()); // trim method is removing any blank spaces but should
        //at beginning or last. example "   AB  C " -----output will be "AB  C"

        System.out.println(emptyString1.isEmpty()); // isEmpty is checking for the length.
        System.out.println(emptyString1.isBlank()); // isBlank is doing trimming at first then checking the length.


    }
}
