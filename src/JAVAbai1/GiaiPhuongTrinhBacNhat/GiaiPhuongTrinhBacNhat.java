package JAVAbai1.GiaiPhuongTrinhBacNhat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        int a;
        int b;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số a");
        a = scanner.nextInt();
        System.out.println("nhập vào số b");
        b = scanner.nextInt();
        System.out.println("phương trình bạn nhập vào là:" + a + "x +" + b + "=0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            nghiem = (double)-b/a;
            System.out.println("phương trình có nghiệm x ="+decimalFormat.format(nghiem)+"");
        }
    }
}
