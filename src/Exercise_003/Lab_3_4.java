package Exercise_003;
public class Lab_3_4 {
    public static void main(String[] args) {
        System.out.print("Sort an integer array from min to max");
        int[] intArr_1 = {1, 12, 16, 28, 34};
        int[] intArr_2 = {1, 13, 16, 27, 99};
        int intArrayLength = intArr_1.length+intArr_2.length;
        int[] intArr = new int [intArrayLength];

        //Merge intArr_1 and intArr_2
        int i = 0;
        for( ;i < intArrayLength; i++){
            if (i<intArr_1.length){
                intArr[i] = intArr_1[i];
            }
            else intArr[i] = intArr_2[i-intArr_1.length];
        }

        //Sort Array
        for (i = 0; i < intArr.length-1; i++) {
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
