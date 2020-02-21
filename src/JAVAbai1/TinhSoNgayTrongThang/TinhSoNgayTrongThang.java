package JAVAbai1.TinhSoNgayTrongThang;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tháng bạn muốn:");
        int month = scanner.nextInt();
        String newDay;
        switch (month) {
            case 2:
                newDay = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                newDay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                newDay = "30";
                break;
            default:
                newDay = "";
        }

        if (newDay != "") System.out.printf("The month '%d' has %s days!", month, newDay);
        else System.out.print("Invalid input!");
    }
}
