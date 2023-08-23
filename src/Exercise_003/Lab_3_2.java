package Exercise_003;
public class Lab_3_2 {
    public static void main(String[] args) {
        System.out.print("Finding maximum value/minimum value");
        int[] intArr = {1, 2, 3, 4, 5};
        int maximumNumber = intArr[intArr.length-1];
        int minimumNumber = intArr[intArr.length-1];
        for (int i = intArr.length - 1; i >= 0; i--) {
            if(intArr[i] > maximumNumber){
                maximumNumber = intArr[i];
            }
            else if(intArr[i] < minimumNumber){
                minimumNumber = intArr[i];
            }

        }
        System.out.printf("\n\t\tMaximum Number: %d", maximumNumber);
        System.out.printf("\n\t\tMinimum Number: %d", minimumNumber);
    }
}
