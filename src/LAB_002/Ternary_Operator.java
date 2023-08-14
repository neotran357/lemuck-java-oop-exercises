package LAB_002;
import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn đến đúng giờ chứ? (Answer: true/false): ");
        boolean isYouonTime = scanner.nextBoolean();

        /*
        if(isYouonTime){
            System.out.println("Please talk anything with me!");
        }
        else {
            System.out.println("Get away");
        }

         */
        // Ternary operator là toán tử 3 ngôi và chỉ dùng cho logic được chia làm 2 là True hoặc False
        String outputMsg = isYouonTime ? "Please talk anything with me!":"Get away";
        System.out.println(outputMsg);
    }

}
