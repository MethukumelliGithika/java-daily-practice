import java.util.*;

public class BasicJavaPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // String methods
        System.out.println("\n--- String Methods ---");
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());

        // Operators
        System.out.println("\n--- Operators ---");
        System.out.println("Number + 10 = " + (num + 10));
        System.out.println("Number * 2 = " + (num * 2));

        // Math methods
        System.out.println("\n--- Math Methods ---");
        System.out.println("Square root: " + Math.sqrt(num));
        System.out.println("Power (num^2): " + Math.pow(num, 2));
    }
}
