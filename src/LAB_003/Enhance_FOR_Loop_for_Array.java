package LAB_003;
public class Enhance_FOR_Loop_for_Array {
    public static void main(String[] args) {
        /*
            Type 1:
                datatype [] arrayName;
                datatype arrayName [];
            Type 2
                datatype [] arrayName = new datatype[arrayLength];
                datatype arrayName [] = new datatype[arrayLength];
            Type 3:
                datatype [] arrayName = new datatype[] {e1,e2,e3};
                datatype arrayName [] = {e1,e2,e3};
         */

        //Enhance FOR loop for array
        System.out.print("\n\n***Enhance FOR loop for array***");
        int arrayLength = 5;
        String[] studentName = new String[arrayLength];
        studentName[0] = "Vương Lâm";
        studentName[1] = "Tô Minh";
        studentName[2] = "Mạnh Hạo";
        studentName[3] = "Bạch Tiểu Thuần";
        studentName[4] = "Vương Bảo Nhạc";
        //studentName[5] = "Cont...";
        /*
            Nhập tên array + . + forr
            e.g: studentName.forr
            Dùng khi muốn lấy giá trị của element ra và không cần update giá trị của nó.
         */
        for (int length = arrayLength; length > 0; length--) {
            System.out.printf("\nStudent Name %d: %s", length, studentName[length-1]);
        }

    }
}