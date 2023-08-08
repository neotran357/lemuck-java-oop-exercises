package LAB_001;

public class Operator_Datatype {
    /*
        Primitive Type          Wrapper Class
        boolean                     Boolean
        char                        Character
        byte                        Byte
        short                       Short
        int                         Integer
        long                        Long
        float                       Float
        double                      Double

        Kiểu Primitive
         1. Boolean
            Đây là kiểu dữ liệu có bộ nhớ lưu trữ nhỏ nhất, chỉ có 1 bit. Kiểu dữ liệu này được dùng để lưu trữ hai trạng thái true hoặc false Giá trị mặc định là false.

            Ví dụ: boolean extractall = true

         2. Char
            Kiểu dữ liệu này có thể dùng để lưu kí tự hoặc số nguyên không âm, có kích thước 2 byte. Giá trị nhỏ nhất là '\u0000' (hoặc 0) và giá trị lớn nhất là '\uffff' (hoặc 65,535).

            Ví dụ: char name ='A' Câu hỏi đặt ra là vì sao kiểu dữ liệu char có giá trị mặc định là '\u0000' và bộ nhớ là 2 byte? Lý do là vì Java sử dụng bảng mã Unicode. Trong Unicode mỗi ký tự giữ 2 byte, do đó Java cũng cấp cho kiểu dữ liệu char bộ nhớ 2 byte.

         3. Byte
            Kiểu dữ liệu này dùng để lưu số nguyên (âm hoặc dương), có kích thước 1 byte. Giá trị nhỏ nhất là -128 (-2^7) và giá trị lớn nhất là 127 (2^7 -1) Giá trị mặc định là 0.

            Ví dụ: byte x = 1 , byte y = -1

         4. Short
            Dùng để lưu dữ liệu có kiểu số nguyên, nhưng kích cỡ lớn hơn byte. Bộ nhớ kiểu dữ liệu này là 2 byte. Giá trị nhỏ nhất là -32,768 (-2^15) và giá trị lớn nhất là 32,767 (2^15 -1) Giá trị mặc định là 0.

            Ví dụ: short t = 50, short z = -50

          5. Int
            Đây cũng là kiểu dữ liệu dùng để lưu kiểu số nguyên, kích cỡ 4 byte (lớn hơn byte và short). Giá trị nhỏ nhất là - 2,147,483,648.(-2^31) và giá trị lớn nhất là 2,147,483,647 (2^31 -1) Thông thường, int được sử dụng làm kiểu dữ liệu mặc định cho các giá trị nguyên. Giá trị mặc định là 0.

            Ví dụ: int a = 500, int b = -500

          6. Long
            Kiểu dữ liệu dùng để lưu số nguyên lớn nhất là Long. Kích cỡ của nó lên đến 8 byte. Giá trị nhỏ nhất là -9,223,372,036,854,775,808.(-2^63) và lớn nhất là 9,223,372,036,854,775,807 (2^63 -1) Kiểu này được sử dụng khi cần một dải giá trị rộng hơn int. Giá trị mặc định là 0L.

            Ví dụ: long a = 100000L, int b = -100000L

          7. Float
            Float là kiểu dữ liệu lưu số thực, kích cỡ 4 byte. Giá trị mặc định là 0.0f. Kiểu Float không bao giờ được sử dụng cho các giá trị chính xác như currency.

            Ví dụ: float jpy = 22.2f

          8. Double
            Double cũng là kiểu dữ liệu để lưu số thực, nhưng kích thước dữ liệu lớn hơn Float. Bộ nhớ của nó là 8 byte. Thông thường, kiểu dữ liệu này được sử dụng làm kiểu mặc định cho các giá trị decimal. Kiểu double cũng không bao giờ được sử dụng cho các giá trị chính xác như currency. Giá trị mặc định là 0.0d.

            Ví dụ: double ct = 676.7

            Kiểu Non - Primitive
            Trong Java tồn tại kiểu biến đối tượng, được tạo bằng cách sử dụng các constructor đã được định nghĩa của các class. Chúng được sử dụng để truy cập các đối tượng. Những biến này được khai báo ở kiểu cụ thể và không thể thay đổi được

            Giá trị mặc định của kiểu biến đối tượng là null. Có thể sử dụng biến đối tượng để tham chiếu tới bất kỳ đối tượng nào trong kiểu được khai báo hoặc bất kỳ kiểu tương thích nào.

*/
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        byte myByteNumber = 1;
        char myChar= 'a';
        boolean myBoolean = true;
        int  myInt = 123;
        double myDouble = 1.234556789D;
        float myFloat = -1.234556789F;
        long myLong = 12L;

        System.out.println("myByteNumber: " + myByteNumber);
        System.out.println("myChar: " + myChar);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myLong: " + myLong);
        System.out.println("Byte range: ["+ Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");
        System.out.println("Short range: ["+ Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");
        System.out.println("Integer range: ["+ Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
        System.out.println("Long range: ["+ Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");
        System.out.println("Float range: ["+ Float.MIN_VALUE + ", " + Float.MAX_VALUE + "]");
        System.out.println("Double range: ["+ Double.MIN_VALUE + ", " + Double.MAX_VALUE + "]");
        System.out.println("Character range: ["+ Character.MIN_VALUE + ", " + Character.MAX_VALUE + "]");
        System.out.println("Boolea range: true/false");





    }
}
