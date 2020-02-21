package JAVAbai1.KiemTraSoNguyenTo;


import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        int i = 2;
        boolean check = true;
        int number;

        System.out.println("mời bạn nhập vào một số: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }

        if (check)
            System.out.println(number + " số bạn nhập là số nguyên tố.");
        else
            System.out.println(number + " số bạn nhập không phải số nguyên tố.");

    }
}
