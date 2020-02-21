package JAVAbai2.XoaPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class Xoaphantu2 {
    // viết hàm xóa phần tử trong mảng
    public static int[] removeTheElement(int[] arr,
                                         int index) {

     //nếu mảng trống hoặc không nằm trong phạm vi mảng thì trả về mảng ban đầu
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
       //tạo mảng khác có kích thước nhỏ hơn 1
        int[] anotherArray = new int[arr.length - 1];

       //sao chép các phần tử từ mảng cũ sang mảng mới
        for (int i = 0, k = 0; i < arr.length; i++) {

            //loại bỏ chỉ mục được chọn
            if (i == index) {
                continue;
            }
            //chỉ số cần được loại bỏ là
            anotherArray[k++] = arr[i];
        }

        //trả về kết quả cho mảng
        return anotherArray;
    }

   //mả trình điều khiển
    public static void main(String[] args) {

       //lấy mảng
        int[] arr = {1, 2, 3, 4, 5};

       //in ra kết quả mảng
        System.out.println("Original Array: "
                + Arrays.toString(arr));

       // chỉ số phần tử cần xóa
        Scanner s = new Scanner(System.in);
        int index = s.nextInt();

        //in ra chỉ mục
        System.out.println("Index to be removed: "
                + index);

        //xóa phần tử
        arr = removeTheElement(arr, index);

       //in mảng kết quả
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}
