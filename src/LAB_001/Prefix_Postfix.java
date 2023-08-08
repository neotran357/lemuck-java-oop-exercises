package LAB_001;


public class Prefix_Postfix {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //n ra một giá trị hoặc một chuỗi ký tự và xuống dòng sau đó.
        int myNumber_1 = 1;
        int myNumber_2 = 2;
        int total = ++myNumber_1 + myNumber_2++;
        System.out.println("myNumber_1: "+ myNumber_1);
        System.out.println("myNumber_2: "+ myNumber_2);
        System.out.println("total: "+ total);
    }
    /*
        Flow process:
            1. Prefix sẽ được tính trước myNumber_1 = 1 tăng lên 1 đơn vị là: 2
            2. Tính toán va gán giá trị cho total à: total = myNumber_1 + myNumber_2 = 2 +2 = 4
            3. Post sẽ được tính trước myNumber_2 =2 tăng lên 1 đơn vị là: 3
            => Output screen:
                    myNumber_1: 2
                    myNumber_2: 3
                    total: 4
     */
}
