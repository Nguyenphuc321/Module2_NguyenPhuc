package JAVAbai1.HienThiSoNguyenTo;


import java.util.Scanner;

public class HienThiSoNguyenTo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Bạn cần nhập bao nhiêu số nguyên tố:");
        int n = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}