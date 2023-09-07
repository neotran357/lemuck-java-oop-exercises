package LAB_004;

import java.util.Scanner;
import java.security.SecureRandom;

public class DO_WHILE_LOOP {

    /*Game Description:
         1. Cho 1 con số random từ 1 -> 5
         2. Player phải nhập vào 1 con số để đoán số random đó trong 3 lượt chơi:
               + Nếu đoán đúng, player sẽ nhận 1 message "Chúc mừng bạn đã đoán chính xác! (^_^)" => End game
               + Nếu đoán sai, player sẽ nhận 1 message "Haizz! Bạn đã đoán sai rồi.(0_0)"
                   => End game nếu hết lượt chơi
                   => Cho phép đoán lại nêu còn ít nhất 1 lượt chơi.

     */
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        //do while loop là để thực thi ít nhất 1 lần trước khi đưa vào kiểm tra condition ở while
        do {
            //Guessing number
            System.out.print("Please Guess Number <= 5:");
            Scanner scanner = new Scanner(System.in);
            int inputedNumber = scanner.nextInt();
            if (inputedNumber == randomNumber){
                System.out.println("\t\tChúc mừng bạn đã đoán chính xác! (^_^)");
                break;
            } else {
                System.out.println("\t\tHaizz! Bạn đã đoán sai rồi.(0_0)");

            }
            guessingTime++;
        }
        while (guessingTime < 3);
    }
}
