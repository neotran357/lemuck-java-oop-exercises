package LAB_002;

import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Làm ơn nhập 1 số 1: ");
        int n = scanner.nextInt();

        System.out.print("Làm ơn nhập 1 số 2: ");
        int i = scanner.nextInt();

        while (i >= n) {
            System.out.printf("Giá trị của n: %d\n", n);
            System.out.printf("Giá trị của i: %d\n\n", i);
            i--;

        }
    }
}
