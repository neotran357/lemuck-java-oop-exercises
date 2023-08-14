package LAB_001;


public class Operator_Assignment {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Thực hiện phép gán");
        int x1 = 5; int y1=10;
        int x2 = 5; int y2=10;
        int x3 = 5; int y3=10;
        int x4 = 5; int y4=10;
        int x5 = 5; int y5=10;
        String myStringValue = "Bạn vui chứ?"; //Tên biến thường được viết kiểu camel

        x1 += y1; // Tương đương với x = x + y. Kết quả: 15
        System.out.println("x1: " +x1);
        x2 -= y2; // Tương đương với x = x - y. Kết quả: 10
        System.out.println("x2: " +x2);
        x3 *= y3; // Tương đương với x = x * y. Kết quả: 50
        System.out.println("x3: " +x3);
        x4 /= y4; // Tương đương với x = x / y. Kết quả: 10
        System.out.println("x4: " +x4);
        x5 %= y5; // Tương đương với x = x % y. Kết quả: 0
        System.out.println("x5: " +x5);


    }
}
