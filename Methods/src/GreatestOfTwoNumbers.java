public class GreatestOfTwoNumbers {
    public static int greatest(int number1, int number2, int number3) {
        int great = number1;

        if(number2 > great){
            great = number2;
        }
        if (number3 > great) {
            great = number3;
        }
        return great;
    }

    public static void main(String[] args) {
        int result = greatest(3,2,7);
        System.out.println("Greatest number = " + result);
    }
}
