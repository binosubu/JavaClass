package day7;

public class School {
    public static void main(String[] args) {

        Student binod = new Student("Binod", "Maharjan", 01);
        Student ram = new Student("Ram", "Shrestha", 02, "Account");
        Student hari = new Student("Hari", "Dahal", 03, "Management", "Economics");

        System.out.println(binod.getFirstName());
        System.out.println(binod.getLastName());
        System.out.println(binod.getRollNumber());

        System.out.println(ram.getFirstName());
        System.out.println(ram.getLastName());
        System.out.println(ram.getRollNumber());
        System.out.println(ram.getMajor());

        System.out.println(hari.getFirstName());
        System.out.println(hari.getLastName());
        System.out.println(hari.getRollNumber());
        System.out.println(hari.getMajor());
        System.out.println(hari.getMinor());
    }
}
