import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's try if we can travel to the method world:");
        greet();
        System.out.println("Looks like we can, let's try again:");
        greet();
        greet();

        System.out.println("Enter the number of times to print the phrase : ");
        int  num = Integer.parseInt(scanner.nextLine());
        int i = 0;

        while (i < num) {
            printText();
            i++;
        }

        printUntilNumber(2);
        sum(3,2);
        division(3,5);
        divisibleByThreeInRange(3,6);
        divisibleByThreeInRange(2,10);

        // Parameter Values Are Copied in a Method Call
        int min = 5;
        int max = 10;

        printNumbers(min, max);
        System.out.println();

        min = 8;

        printNumbers(min, max);
    }

    public static void greet() {
        System.out.println("Greetings from the method world!");
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method.");
    }

    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }

    public static void sum (int first, int second){
        System.out.println("Sum = " + (first + second));
    }

    public static void division (int numerator, int denominator) {
        System.out.println("Remainder = " + ((float) numerator / denominator));
    }

    public static  void divisibleByThreeInRange(int beginning, int end){
        while ( beginning <= end){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning++;
        }
    }

    public static void printNumbers (int min, int max){
        while (min < max){
            System.out.println(min);
            min++;
        }
    }
}