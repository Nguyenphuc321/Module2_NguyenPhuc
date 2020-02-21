package JAVAbai2.XoaPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    //viết hàm để xóa phần tử trong mảng
    public static int[] removeElements(int[]arr,int key){
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];
        return Arrays.copyOf(arr, index);
        //dùng để sao chép mảng được chỉ định vào một mảng mới của cùng một kiểu
        //trong khi sao chép mảng mới được cắt ngắn hoặc được thêm vào với một chiều dài nhất định
    }
    public static void main(String[] args)
    {
        int[] array = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
//        int key = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào phần tử cần xóa");
        int key = scanner.nextInt();
        array = removeElements(array, key);
        //ta sử dụng hàm removeElement để loại bỏ các phần tử trùng nhau
        System.out.println(Arrays.toString(array));
        //phương thức toString trả về chuỗi các phần tử của mảng,các phần tử này được cách nhau bởi dấu ,
    }
}
