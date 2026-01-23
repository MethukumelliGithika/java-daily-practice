import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of 3 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;

        // Type casting int to double
        double percentage = (double) total / 3;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
