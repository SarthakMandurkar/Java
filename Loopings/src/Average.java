import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Enter Number : ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                System.out.println("Exiting....!");
                break;
            } else {
                sum = sum + num;
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Number of inputs = " + count);
        System.out.println("Average = " + avg);
    }
}
