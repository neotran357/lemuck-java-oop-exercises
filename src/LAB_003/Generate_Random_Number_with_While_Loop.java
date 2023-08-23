package LAB_003;
import java.util.Scanner;
import java.util.Random;
public class Generate_Random_Number_with_While_Loop {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("Generate random number (<100):");
            System.out.println("1 - Play: ");
            System.out.println("0 - Exit: ");
            System.out.print("Please choose option:");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option == 0) {
                isContinuing = false;
                System.out.println("\u001B[32mExit Successfully!\u001B[0m"); //Tạo Chữ màu xanh
            }
            else if (option == 1){
                Random random = new Random();
                int randomNumber = random.nextInt(100);
                System.out.printf("Generate Number: %d\n", randomNumber);
            }
            else {
                System.out.println("\u001B[31m[ERROR] The inputted data is incorrectly!\u001B[0m"); //Tạo Chữ màu đỏ
                continue;
                }
        }

    }
}
