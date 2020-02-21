package JAVAbai2.ChuyenNhietDo;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào nhiệt độ cần chuyển đổi:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (double) 9 / 5 * celsius + 32;
        System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
    }
}
