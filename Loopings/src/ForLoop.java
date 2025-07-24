import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* System.out.println("Enter a number ( < 100 ) : ");
        int num = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
        for(int i = 0; i <= num ; i++){
             System.out.println(i);
        }
        for (int i = num ; i <= 100 ; i++){
            System.out.println(i);
        }
        while (num <= 100){
            System.out.println(num);
            num++;
        }
        System.out.println("Where to ?");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i <= number ; i++){
            System.out.println(i);
        }*/

        System.out.println("Where from? ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Where to? ");
        int end = Integer.parseInt(scanner.nextLine());

        if( start > end) {
            System.out.println("Wrong input! Exiting....");
        }

        for (int i = start; i <= end ; i++){
            System.out.println(i);
        }
    }
}
