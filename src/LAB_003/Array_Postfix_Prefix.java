package LAB_003;

public class Array_Postfix_Prefix {
    public static void main(String[] args) {
        int [] myIntArray = {9,9,9,9, 9};
        for (int i = 0; i < 5;) {
            myIntArray[i++] = i;
        }
        for(int value:myIntArray){
            System.out.println(value);
        }
    }
}
