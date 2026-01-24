import java.util.*;

public class OperatorsAndMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Math methods
        System.out.println("Max value: " + Math.max(a, b));
        System.out.println("Min value: " + Math.min(a, b));
        System.out.println("Square root of a: " + Math.sqrt(a));
        System.out.println("Power (a^b): " + Math.pow(a, b));
    }
}
