import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Contains Text";
        int num = 12344;
        double floatingPoint = 111.222;
        boolean trueOrFalse = true;

        Scanner scanner = new Scanner(System.in);
        int Chicken = 9000;
        double Bacon = 0.1;
        String Tractor = "Zetor";

        System.out.println("Here it " + text);
        System.out.println("Here it Contains " + num);
        System.out.println("Here it Contains " + floatingPoint);
        System.out.println("Here it Contains " + trueOrFalse);

        System.out.println("Chicken :\n" + Chicken);
        System.out.println("Bacon :\n" + Bacon);
        System.out.println("Tractor :\n" + Tractor);

        System.out.println("What Value You have to print : ");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("The value is " + value);

        System.out.println("What Value You have to print : ");
        double aDouble = Double.valueOf(scanner.nextLine());
        System.out.println("The value is " + aDouble);

        System.out.println("What Value You have to print : ");
        boolean aBool = Boolean.valueOf(scanner.nextLine());
        System.out.println("The value is " + aBool);

    }
}