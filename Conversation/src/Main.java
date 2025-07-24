import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings! How are you doing?");
        String greet = scanner.nextLine();
        System.out.println(greet);

        System.out.println("Oh, how interesting. Tell me more!");
        String gen = scanner.nextLine();
        System.out.println(gen);

        System.out.println("Thanks for sharing!");
    }
}