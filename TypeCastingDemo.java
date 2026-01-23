import java.util.Scanner;

public class TypeCastingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Widening Type Casting (int → double)
        System.out.println("Enter an integer value:");
        int num = sc.nextInt();
        double doubleValue = num;

        // Narrowing Type Casting (double → int)
        System.out.println("Enter a decimal value:");
        double decimal = sc.nextDouble();
        int intValue = (int) decimal;

        System.out.println("\n--- Type Casting Result ---");
        System.out.println("Integer to Double : " + doubleValue);
        System.out.println("Double to Integer : " + intValue);
    }
}
