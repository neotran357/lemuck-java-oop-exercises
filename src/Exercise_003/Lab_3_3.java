package Exercise_003;
public class Lab_3_3 {
    public static void main(String[] args) {
        System.out.print("Sort an integer array from min to max");
        int[] intArr = {12, 34, 1, 16, 28};
        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = 0; j < intArr.length - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }

            }

        }
        System.out.println("Sorted Array:");
        for (int index = 0; index < intArr.length; index++) {
            System.out.print("   " + intArr[index]);
        }

    }
}
