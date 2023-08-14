package LAB_002;
import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        final int EXPECTED_TIME = 7; // Thường thì tên của constant sẽ được viết HOA và cách nhau bởi "_" character
        //expectedTime = 8;  // Không thể re-assgin giá trị khác cho 1 constant.
        System.out.println("Go to Cafe shop");
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Bạn đến lúc mấy giờ: ");
        int hour = scanner.nextInt();
        boolean isYouonTime = hour == EXPECTED_TIME;

        if(isYouonTime){
            System.out.println("    -> Let's talk");
        }
        else {
            System.out.println("    -> Write a message");
        }
    }

}
