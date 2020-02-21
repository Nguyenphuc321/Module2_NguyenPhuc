package JAVAbai2.SoLuongSinhVien;

import java.util.Scanner;

public class SoLuongSinhVien {
    public static void main(String[] args) {
        System.out.println("ứng dụng đếm số lượng sinh viên thi đỗ");
        int size;
        int[]array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào kich thước");
            size = scanner.nextInt();
            if (size>30)
                System.out.println("kích thước bạn nhập không vượt quá 30");
        }while (size>30);
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhập điểm cho sinh viên"+(i+1)+":");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("danh sách của bạn");
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]+":");
            if (array[j]>=5&&array[j]<=10)
                count++;
        }
        System.out.println("số lượng học sinh vượt qua kì thi là"+count);
    }
}
