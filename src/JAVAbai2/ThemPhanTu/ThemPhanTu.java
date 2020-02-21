package JAVAbai2.ThemPhanTu;

import java.util.Arrays;

public class ThemPhanTu {
   public static int[] insert(int n, int arr[],int x,int pos){
       //n là độ dài mảng,x là phần tử cần chèn,pos là phần tử trong mảng
       int i;
       int newarr[] = new int[n+1];
       //tạo mảng có kích thước mới là n+1
       for ( i = 0; i < n+1 ; i++) {
           if (i<pos-1)
               newarr[i] = arr[i];
           else if (i==pos-1)
               newarr[i] = x;
           else
               newarr[i] = arr[i-1];
       }
       return newarr;
   }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("mảng ban đầu là:\n" + Arrays.toString(arr));
        int x = 50;
       int pos = 5;
        arr = insert(n, arr, x, pos);
        //ta gọi phương thức để chèn mảng tại vị trí pos
        System.out.println("\nmảng có phần tử:" + x
                + " chèn ở vị trí "
                + pos + ":\n"
                + Arrays.toString(arr));
    }
}
