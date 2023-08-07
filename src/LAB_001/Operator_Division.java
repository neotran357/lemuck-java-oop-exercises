package LAB_001;
import java.util.Scanner;

public class Operator_Division {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Thực hiện phép chia 2 số a : b = c");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int quotient  = a/b; // Lấy phần nguyên
        int remainder = a%b; // Lấy phần d
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder  : " + remainder);
        scanner.close();
    }
}
