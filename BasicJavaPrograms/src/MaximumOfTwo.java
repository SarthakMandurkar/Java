import java.util.Scanner;

public class MaximumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number to check : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number to check : ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else {
            System.out.println(num2 + " is greater than " + num1 + ".");
        }

        scanner.close();
    }
}
