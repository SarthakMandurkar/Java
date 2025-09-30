package Basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = in.nextInt();

        System.out.print("Factors of " + num + " are: ");

        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                System.out.print(i + " ");

                }
            }
        in.close();
    }
}

// Another method
/* for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {  // avoid duplicate when i == num/i
                    System.out.print(num / i + " ");
                }
            }
        }
 */