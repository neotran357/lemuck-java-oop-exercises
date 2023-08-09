package LAB_002;
import java.util.Scanner;

public class Single_Conditional_Statement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn đến đúng giờ chứ? (Answer: true/false): ");
        boolean isYouonTime = scanner.nextBoolean();

        if(isYouonTime){
            System.out.println("Please talk anything with me!");
        }
        else {
            System.out.println("Get away");
        }
    }

}
