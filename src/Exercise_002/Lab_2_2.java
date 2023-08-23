package Exercise_002;
import java.util.Scanner;

public class Lab_2_2 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            ConsoleHeader.main(args);
            System.out.println("Odd or Even number:");
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
                System.out.print("Input Your Number (m): \n");
                int  Number = scanner.nextInt();

                if (Number % 2 ==0) {
                    System.out.println("\u001B[34mEven Number.\u001B[0m");
                }
                else {
                    System.out.println("\u001B[31mOdd Number.\u001B[0m");
                }
            }

        }
    }
}

