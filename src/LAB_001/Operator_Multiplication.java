package LAB_001;
import java.util.Scanner;

public class Operator_Multiplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Thực hiện phép nhân 2 số a * b = c");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int c = a * b;
        System.out.println("C: " +c);
        scanner.close();
    }
}
