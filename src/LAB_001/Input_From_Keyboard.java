package LAB_001;
import java.util.Scanner;

public class Input_From_Keyboard {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Họ của bạn: ");
        String Firstname = scanner.next();
        System.out.print("Nhập Chữ Lót của tên bạn: ");
        String Middlename = scanner.next();

        System.out.print("Nhập Tên của bạn: ");
        String Lastname = scanner.next();
        System.out.printf("Welcome: %s %s %s \n", Firstname,Middlename,Lastname);

        System.out.print("Nhập giá trị a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập giá trị b: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.printf("Giá trị nhập vào từ keyboard: a= %d, b = %d", a, b );
        scanner.close();
    }
}
