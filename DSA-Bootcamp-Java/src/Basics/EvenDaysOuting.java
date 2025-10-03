package Basics;

public class EvenDaysOuting {
    public static void main(String[] args) {

        int count = 0;
        int noOfDays = 31;

        for(int i = 1; i <= noOfDays; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("The number of days Kunal can go out is : " + count);
    }
}
