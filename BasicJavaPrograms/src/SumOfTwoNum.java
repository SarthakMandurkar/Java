import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int number1 =Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Second Number : ");
        int number2 =Integer.parseInt(scanner.nextLine());

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);

        scanner.close();
    }
}
