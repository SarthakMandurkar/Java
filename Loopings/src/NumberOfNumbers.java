import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int count = 0;
        int sum = 0;
       /* while (true){
            System.out.println("Give a number : ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0){
                System.out.println("Exiting....!");
                break;
            }
            count++;
        }
        System.out.println(count); */

       /* while (true) {
            System.out.println("Enter a number : ");
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0){
                System.out.println("Exiting....!");
                break;
            } else if (num < 0) {
                count++;
            } else
                continue;
        }
        System.out.println("Total Number of negative numbers are : " + count); */

        while (true){
            System.out.println("Enter number : ");
            int a = Integer.parseInt(scanner.nextLine());
            if (a == 0) {
                System.out.println("Exit!");
                break;
            } else
                sum = sum + a;
        }
        System.out.println("Sum = " + sum);
    }
}
