import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> input = new ArrayList<>();

        System.out.println("Enter the integers : ");

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }
            input.add(num);
        }

        System.out.println(input.get(1) + input.get(2));
    }
}

