import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the to print multiplication table of : ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i <=10 ; i++) {
            System.out.println(num + "x" + i + " = " + (num * i));
        }
        scanner.close();
    }
}
