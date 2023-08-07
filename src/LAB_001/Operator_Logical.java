package LAB_001;


public class Operator_Logical {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean x = true;
        boolean y = false;

        boolean result1 = x && y; // Phép AND logic. Kết quả: false
        System.out.println("result1: " + result1);
        boolean result2 = x || y; // Phép OR logic. Kết quả: true
        System.out.println("result2: " + result2);
        boolean result3 = !x; // Phép NOT logic. Kết quả: false
        System.out.println("result3: " + result3);

    }
}
