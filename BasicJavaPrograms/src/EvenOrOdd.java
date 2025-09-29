import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check : ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + "is an odd number.");
        }

        scanner.close();
    }
}
