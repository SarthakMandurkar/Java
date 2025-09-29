public class Averaging {
    public static int sum(int num1, int num2, int num3, int num4) {
        return (num1 + num2 + num3 + num4);
    }

    public static double avg(int num1, int num2, int num3, int num4) {
        int res = sum(num1, num2, num3, num4);
        return ((double) res/4);
    }

    public static void main(String[] args) {
        double result = avg(2, 2, 2, 2);
        System.out.println("Average = " + result);
    }
}
