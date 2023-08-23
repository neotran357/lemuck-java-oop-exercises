package Exercise_002;
import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            ConsoleHeader.main(args);
            System.out.println("Check Your BMI:");
            System.out.println("1 - Play: ");
            System.out.println("0 - Exit: ");
            System.out.print("Please choose option:");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option == 0) {
                isContinuing = false;
                System.out.println("\u001B[32mExit Successfully!\u001B[0m"); //Tạo Chữ màu xanh
            }
            else if (option == 1) {
                System.out.print("Input your Height (m): \n");
                double Height = scanner.nextDouble();
                System.out.print("\nInput your Weight (kg): \n");
                double Weight = scanner.nextDouble();
                double BMI = Weight / (Height * 2);
                System.out.print("BMI Results: ");
                if (BMI < 18.5) {
                    System.out.println("\u001B[34mPlease increase weight!\u001B[0m");

                } else if (BMI >= 18.5 && BMI <= 24.9) {
                    System.out.println("\u001B[32mPlease kept current weight!\u001B[0m");
                } else if (BMI >= 25 && BMI <= 29.9) {
                    System.out.println("\u001B[33mPlease decrease weight!\u001B[0m");
                } else {
                    System.out.println("\u001B[31m[Danger] Please decrease weight!\u001B[0m");
                }
            }
            else {
                System.out.println("\u001B[31m[ERROR] The inputted data is incorrectly!\u001B[0m"); //Tạo Chữ màu đỏ
                continue;
            }

        }
    }
}

