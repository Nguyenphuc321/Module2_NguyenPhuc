package JAVAbai2.TimGiaTriLonNhat;

import java.util.Arrays;

public class Timphantulonnhat {
    static int phantulonnhat(int arr[],int n)
    {
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static void main(String[] args) {
        int arr[] = {10,5,3,6,70,5};
        int n = arr.length;
        System.out.println("phần tử lớn nhất trong mảng là"+phantulonnhat(arr,n));
    }

}
