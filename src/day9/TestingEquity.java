package day9;

public class TestingEquity {
    public static void main(String[] args) {

      int a = 3;
      int b = 3;
      boolean isEqual = a == b;
      System.out.println(isEqual);

      String greeting = "Hello";
      boolean isEqual1 = greeting == "Hello";
      System.out.println(isEqual1);

      String subString = greeting.substring(0, 3);
      System.out.println(subString);

        /* (== method use check the memory location of the object and
      use for primitive location only) */
      boolean isEqual2 = subString =="Hel";
      System.out.println(isEqual2);

        /* (.equals method use to compare the value of the object
      and should be always use*/
      boolean isEqual3 = subString.equals("Hel");
      System.out.println(isEqual3);

      boolean isEqual4 = "hello".equals("Hello");
      System.out.println(isEqual4);

      // .equalsIgnoreCase is use to check the value of string by ignoring string case. check below example.
      boolean isEqual5 = "hello".equalsIgnoreCase("Hello");
      System.out.println(isEqual5);
    }
}