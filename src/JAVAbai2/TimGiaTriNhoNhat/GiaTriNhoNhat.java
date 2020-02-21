package JAVAbai2.TimGiaTriNhoNhat;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {1, 8, 7, 5, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
