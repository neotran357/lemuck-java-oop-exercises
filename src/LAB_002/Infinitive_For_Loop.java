package LAB_002;

import java.util.Random;
import java.util.Scanner;

public class Infinitive_For_Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lần chạy: ");
        int n = scanner.nextInt();

        //Case 1:
        int i = 0;
        for (; ; ) {
            String randomMobileNumber;
            Random random = new Random();

            // Generate the subscriber number (9 digits)
            long subscriberNumber = random.nextLong();
            subscriberNumber = Math.abs(subscriberNumber) % 10000000L; // Ensure 10 digits

            randomMobileNumber = "849" + String.format("%08d", subscriberNumber);
            System.out.println("\t \t" + i + ". Mobile Number: " + randomMobileNumber);

        }
        //Unreachable statement
        //System.out.println("Hello");
        /*
        //Case 2:
        for(;i<=n; ){
            String randomMobileNumber;
            Random random = new Random();

            // Generate the subscriber number (9 digits)
            long subscriberNumber = random.nextLong();
            subscriberNumber = Math.abs(subscriberNumber) % 10000000L; // Ensure 10 digits

            randomMobileNumber= "849" + String.format("%08d", subscriberNumber);
            System.out.println("\t \t"+ i+ ". Mobile Number: " + randomMobileNumber);
        }
    */

    /*
        //Case 3:
        for(int i=0 ;i<=n; ){
            String randomMobileNumber;
            Random random = new Random();

            // Generate the subscriber number (9 digits)
            long subscriberNumber = random.nextLong();
            subscriberNumber = Math.abs(subscriberNumber) % 10000000L; // Ensure 10 digits

            randomMobileNumber= "849" + String.format("%08d", subscriberNumber);
            System.out.println("\t \t"+ i+ ". Mobile Number: " + randomMobileNumber);
        }
    */
    }
}
