package LAB_001;


public class Operator_Bit {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 5;
        int b = 3;

        int bitwiseAnd = a & b; // Phép AND bit. Kết quả: 1
        System.out.println("bitwiseAnd: " + bitwiseAnd);
        int bitwiseOr = a | b; // Phép OR bit. Kết quả: 7
        System.out.println("bitwiseOr: " + bitwiseOr);
        int bitwiseXor = a ^ b; // Phép XOR bit. Kết quả: 6
        System.out.println("bitwiseXor: " + bitwiseXor);
        int leftShift = a << 1; // Dịch trái bit. Kết quả: 10
        System.out.println("leftShift: " + leftShift);
        int rightShift = a >> 1; // Dịch phải bit. Kết quả: 2
        System.out.println("rightShift: " + rightShift);
        int unsignedRightShift = a >>> 1; // Dịch phải bit với giữ nguyên dấu. Kết quả: 2
        System.out.println("unsignedRightShift: " + unsignedRightShift);
    }
}
