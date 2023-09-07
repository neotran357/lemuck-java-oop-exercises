package LAB_004;
import java.util.Scanner;

public class Switch_Case_Statement {
    public static void main(String[] args) {
        /*
            Áp dụng cho nhiều giá trị của 1 bộ dữ liệu mà không cần nhiều if else statement
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Làm ơn nhập 1 số nhỏ hơn 5: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("\t\t\tRank 1");
                break;
            case 2:
                System.out.println("\t\t\tRank 2");
                break;
            case 3:
                System.out.println("\t\t\tRank 3");
                break;
            case 4:
                System.out.println("\t\t\tRank 4");
                break;
            case 5:
                System.out.println("\t\t\tRank 5");
                break;
            default:
                System.out.println("\t\t\tChúc bạn may mắn lần sau");
                break;

        }


        System.out.print("Làm ơn nhập 1 số nhỏ hơn 9: ");
        int date = scanner.nextInt();
        switch (date){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("\t\t\tNgày trong tuần");
                break;
            case 7:
            case 8:
                System.out.println("\t\t\tNgày cuối tuần");
                break;
            default:
                System.out.println("\t\t\tInvalid date");
        }
    }
}
