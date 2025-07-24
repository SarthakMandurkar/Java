import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("a = " + a);
        System.out.println("Enter the second number = ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("b = " + b);

        int Sum = a + b;
        System.out.println(a + " + " + b + " = " + Sum);
        double Product = a * b;
        System.out.println(a + " * " + b + " = " + Product);
        double Remainder = (double) a / b;
        System.out.println(a + " / " + b + " = " + Remainder);

        System.out.println("Enter the number of Days : ");
        int days = Integer.parseInt(scanner.nextLine());
        int seconds = days * 86400;
        System.out.println("The number of Seconds in " + days +" day is " + seconds);

        System.out.println("This is a String " + 2 + 2);

    }
}