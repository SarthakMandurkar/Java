import java.util.Scanner;
public class NumberUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int result = numberUno();
       System.out.println(result);

      String string = word();
       System.out.println(string);

      int sumOfNumbers = sum();
        System.out.println("Sum = " +sumOfNumbers);

      int addition = add(4,3,6,1);
        System.out.println("Addition = " +addition);
    }

    public static int numberUno (){
        return 1;
    }

    public static String word () {
        return "Hello this is word method.";
    }

    public static int sum () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number = ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number = ");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter third number = ");
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter fourth number = ");
        int fourth = Integer.parseInt(scanner.nextLine());

        return first + second + third + fourth;
    }

    public static int add (int first, int second, int third, int fourth){
        return first + second + third + fourth;
    }
}
