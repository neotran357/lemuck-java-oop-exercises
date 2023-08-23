package LAB_003;
public class FlowControlKeyword {
    public static void main(String[] args) {
        System.out.println("\nKhi vòng lặp tới i = 3 thì sẽ thoát khỏi vòng lặp và các câu lệnh bên dưới thành unreacheable state");
        for (int i = 0; i < 10; i++) {
            if(i == 3) break; //Khi vòng lặp tới i = 3 thì sẽ thoát khỏi vòng lặp và các câu lệnh bên dưới thành unreacheable state
            System.out.println(i);
        }
        System.out.println("\nKhi vòng lặp tới i = 3 thì sẽ skip lần lặp này và bước qua vòng lặp tiếp theo (i = 4)");
        for (int i = 0; i < 10; i++) {
            if(i == 3) continue; //Khi vòng lặp tới i = 3 thì sẽ skip lần lặp này và bước qua vòng lặp tiếp theo (i = 4)
            System.out.println(i);
        }
    }
}
