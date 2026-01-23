import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter your city:");
        String city = sc.nextLine();

        System.out.println("\n--- User Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("City : " + city);
    }
}
