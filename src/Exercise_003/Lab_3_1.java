package Exercise_003;

public class Lab_3_1 {
    public static void main(String[] args) {
        System.out.print("Count Odd number and Even Number:");
        int[] intArr = {1, 2, 3, 4, 5};
        int counter_even = 0;
        int counter_odd = 0;
        for (int i = intArr.length - 1; i >= 0; i--) {
            if(intArr[i] % 2 == 0){
                counter_even++;
            }
            else counter_odd++;

        }
        System.out.printf("\n\t\t# ODD Number: %d", counter_odd);
        System.out.printf("\n\t\t# EVEN Number: %d", counter_even);
    }
}
