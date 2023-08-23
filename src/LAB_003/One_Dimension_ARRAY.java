package LAB_003;
public class One_Dimension_ARRAY {
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
        //declare array explicitly
        System.out.print("\n\n***Declare array explicitly***");
        int gradeArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int index = 0; index <= 11; index++) {
            System.out.printf("\nLớp %d", gradeArray[index]);
        }
        //Create array with Length and assigns value for elements
        System.out.print("\n\n***Create array with Length and assigns value for elements***");
        int arrayLength = 5;
        String[] studentName = new String[arrayLength];
        studentName[0] = "Vương Lâm";
        studentName[1] = "Tô Minh";
        studentName[2] = "Mạnh Hạo";
        studentName[3] = "Bạch Tiểu Thuần";
        studentName[4] = "Vương Bảo Nhạc";
        //studentName[5] = "Cont...";
        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("\nStudent Name %d: %s", index+1, studentName[index]);
        }
        //Update array with Length and assigns value for elements
        System.out.print("\n\n***Update array with Length and assigns value for elements***");
        studentName[0] = "Vương Lâm - Tiên Nghịch";
        studentName[1] = "Tô Minh - Cầu Ma";
        studentName[2] = "Mạnh Hạo - Ngã Dục Phong Thiên";
        studentName[3] = "Bạch Tiểu Thuần - Nhất Niệm Vĩnh Hằng";
        studentName[4] = "Vương Bảo Nhạc - Tam Thốn Nhân Giang";
        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("\nStudent Name %d: %s", index+1, studentName[index]);
        }
        //Get Array length
        System.out.print("\n\n***Get Array length***");
        System.out.printf("\ngradeArray Length = %d", gradeArray.length);

        //Delete element for array
        System.out.print("\n\n***Delete element for array***");
        studentName[0] = "Vương Lâm - Tiên Nghịch";
        studentName[1] = "Tô Minh - Cầu Ma";
        studentName[2] = "Mạnh Hạo - Ngã Dục Phong Thiên";
        studentName[3] = "Bạch Tiểu Thuần - Nhất Niệm Vĩnh Hằng";
        studentName[4] = "Vương Bảo Nhạc - Tam Thốn Nhân Giang";

    }
}