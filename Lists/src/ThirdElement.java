import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names you want to add to the list : ");

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }
            names.add(input);
        }
        System.out.println(names.get(2));
    }
}
