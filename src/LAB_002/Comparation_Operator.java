package LAB_002;
import java.util.Scanner;

public class Comparation_Operator {

    public static void main(String[] args) {
        System.out.println("Go to Cafe shop");
        Scanner scanner = new Scanner(System.in);
        System.out.print("   Bạn đến lúc mấy giờ: ");
        int hour = scanner.nextInt();
        boolean isYouonTime = hour == 7;
        /*
         boolean isYouonTime = hour != 7;
         boolean isYouonTime = hour <= 7;
         boolean isYouonTime = hour >= 7;
         boolean isYouonTime = hour < 7;
         boolean isYouonTime = hour > 7;
         */
        if(isYouonTime){
            System.out.println("    -> Let's talk");
        }
        else {
            System.out.println("    -> Write a message");
        }
    }

}
