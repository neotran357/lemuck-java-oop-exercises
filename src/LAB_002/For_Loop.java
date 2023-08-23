package LAB_002;
import java.util.Scanner;
import java.util.Random;
public class For_Loop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lần chạy: ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            String randomMobileNumber;
            Random random = new Random();

            // Generate the subscriber number (9 digits)
            long subscriberNumber = random.nextLong();
            subscriberNumber = Math.abs(subscriberNumber) % 10000000L; // Ensure 10 digits

            randomMobileNumber= "849" + String.format("%08d", subscriberNumber);
            System.out.println("\t \t"+ i+ ". Mobile Number: " + randomMobileNumber);

        }
    }

}
