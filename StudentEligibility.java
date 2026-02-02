import java.util.*;

public class StudentEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        if (age >= 18 && marks >= 50) {
            System.out.println(name + " is ELIGIBLE for Placement Training");
        } else {
            System.out.println(name + " is NOT eligible for Placement Training");
        }
    }
}
