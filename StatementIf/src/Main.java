import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give Speed : ");
        int speed = Integer.parseInt(scanner.nextLine());
        if(speed > 120){
            System.out.println("Speeding Ticket!");
        } else {
            System.out.println("Not a Speeding Ticket!");
        }

        System.out.println("Give an integer : ");
        int num = Integer.parseInt(scanner.nextLine());
        if(num == 0){
            System.out.println("Number is 0 i.e positive.");
        } else if(num > 0){
            System.out.println("Number is Positive.");
        } else {
            System.out.println("Number is Negative.");
        }

        System.out.println("How old are you ?");
        int age = Integer.parseInt(scanner.nextLine());
        if(age > 18){
            System.out.println("You are an Adult.");
        } else {
            System.out.println("Your are not an Adult.");
        }

        System.out.println("Enter the first number = ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number = ");
        int b = Integer.parseInt(scanner.nextLine());

        if(a > b){
            System.out.println(a + " is greater than " + b);
        } else if (b > a){
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("The numbers are equal.");
        }

        boolean isItTrue = true;
        if (isItTrue){
            System.out.println("True.");
        }

        System.out.println("Give Points [0-100] : ");
        int points = Integer.parseInt(scanner.nextLine());
        if(points < 0){
            System.out.println("Impossible!");
        } else if (points <= 49) {
            System.out.println("Failed!");
        } else if (points <= 59) {
            System.out.println("1");
        } else if (points <= 69) {
            System.out.println("2");
        } else if (points <= 79) {
            System.out.println("3");
        } else if (points <= 89) {
            System.out.println("4");
        } else if (points <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

        System.out.println("Enter a number to check even or odd : ");
        int c = Integer.parseInt(scanner.nextLine());
        if (c % 2 == 0){
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }

        int d = 3;
        int e = 5;
        boolean isGreater = d > e;
        System.out.println(isGreater);

        System.out.println("Enter a number to check whether it is divisible by (400) : ");
        int number = Integer.parseInt(scanner.nextLine());
        int remainder = number % 400;
        if (remainder == 0){
            System.out.println(+ number + " is divisible by 400.");
        } else {
            System.out.println(+ number + " is not divisible by 400.");
        }

        System.out.println("Enter a String : ");
        String s1 = scanner.nextLine();
        if(s1.equals("a string")){
            System.out.println("Great! you read the instructions correctly : ");
        } else {
            System.out.println("Missed the Mark");
        }

        System.out.println("Enter first String : ");
        String s2 = scanner.nextLine();
        System.out.println("Enter second String : ");
        String s3 = scanner.nextLine();
        if (s2.equals(s3)){
            System.out.println("The Strings are equal.");
        } else {
            System.out.println("The String are not equal.");
        }

        System.out.println("Enter the password : ");
        String pass = scanner.nextLine();
        if(pass.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        System.out.println("Is the number within the raange of 100-500 : ");
        int f = Integer.parseInt(scanner.nextLine());
        if(f >= 100 && f <= 500 ){
            System.out.println("It is " + f);
        } else {
            System.out.println("It is not :( ");
        }

        System.out.println("Enter a number to check : ");
        int g = Integer.parseInt(scanner.nextLine());
        if (g % 3 == 0 && g % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (g % 3 == 0) {
            System.out.println("Fizz");
        } else if (g % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(g);
        }

        //Leap Year

        System.out.println("Give a Year : ");
        int year = Integer.parseInt(scanner.nextLine());
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
        scanner.close();
    }
}