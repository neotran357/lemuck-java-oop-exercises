package LAB_001;

/*
    %d là cho kiểu số nguyên như: int, double, byte, long
    %f là cho kiểu số thực: float.
    %s là cho kiểu dạng chuỗi: String, char.
    \n là xuống dòng
    \t là thụt vào 1 dòng.
 */
public class Output_Screen_printf {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //In ra một chuỗi được định dạng dựa trên một chuỗi mẫu và các giá trị được cung cấp.
        String name = "John";
        int age = 25;
        double a = 1D;
        long d = 123L;
        float b = 1.5F;
        char s= 'a';
        String chuoi = "Hi there";


        System.out.printf("\n My name is %s and I am %d years old.", name, age);
        System.out.printf("\n %s", s);
// Kết quả: My name is John and I am 25 years old.
    }
}
