package LAB_001;


public class Operator_Comparation {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 10;
        int b = 5;

        boolean isEqual = (a == b); // So sánh bằng. Kết quả: false
        System.out.println("isEqual: " + isEqual);
        boolean isNotEqual = (a != b); // So sánh khác. Kết quả: true
        System.out.println("isNotEqual: " + isNotEqual);
        boolean isGreater = (a > b); // So sánh lớn hơn. Kết quả: true
        System.out.println("isGreater: " + isGreater);
        boolean isLess = (a < b); // So sánh nhỏ hơn. Kết quả: false
        System.out.println("isLess: " + isLess);
        boolean isGreaterOrEqual = (a >= b); // So sánh lớn hơn hoặc bằng. Kết quả: true
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        boolean isLessOrEqual = (a <= b); // So sánh nhỏ hơn hoặc bằng. Kết quả: false
        System.out.println("isLessOrEqual: " + isLessOrEqual);
    }
}
