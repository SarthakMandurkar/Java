import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myMessage = "Hey Sarthak!";
        System.out.println(myMessage);

        System.out.println("Hey Sarthak!" + "How are you?");

        System.out.println("Write a Message : ");
        String message = scanner.nextLine();
        System.out.println(message);

        System.out.println(message + "...Thank you....!");

        String start = "I am the end..";
        String end = "I am the Beginning..";
        System.out.println(start + end);

        System.out.println("What is Your Name ? ");
        String name = scanner.nextLine();
        System.out.println("Hi\t" + name);

    }
}