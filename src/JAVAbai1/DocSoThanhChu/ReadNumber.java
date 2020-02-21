package JAVAbai1.DocSoThanhChu;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một số có 3 chữ số:");
        int number = scanner.nextInt();
        int hundred = number/100;
        int dozen = (number%100)/10;
        int unit = ((number%100)%10);
        if ((hundred==1)&&(dozen==0)&&(unit==0))
            System.out.println("một trăm");
        else if ((hundred==2)&&(dozen==0)&&(unit==0))
            System.out.println("hai trăm");
        else if ((hundred==3)&&(dozen==0)&&(unit==0))
            System.out.println("ba trăm");
        else if ((hundred==4)&&(dozen==0)&&(unit==0))
            System.out.println("bốn trăm");
        else if ((hundred==5)&&(dozen==0)&&(unit==0))
            System.out.println("năm trăm");
        else if ((hundred==6)&&(dozen==0)&&(unit==0))
            System.out.println("sáu trăm");
        else if ((hundred==7)&&(dozen==0)&&(unit==0))
            System.out.println("bảy trăm");
        else if ((hundred==8)&&(dozen==0)&&(unit==0))
            System.out.println("tám trăm");
        else if ((hundred==9)&&(dozen==0)&&(unit==0))
            System.out.println("chín trăm");

        else if ((hundred==0)&&(dozen==1)&&(unit==0))
            System.out.println("mười");
        else if ((hundred==0)&&(dozen==2)&&(unit==0))
            System.out.println("hai mươi");
        else if ((hundred==0)&&(dozen==3)&&(unit==0))
            System.out.println("ba mươi");
        else if ((hundred==0)&&(dozen==4)&&(unit==0))
            System.out.println("bốn mươi");
        else if ((hundred==0)&&(dozen==5)&&(unit==0))
            System.out.println("năm mươi");
        else if ((hundred==0)&&(dozen==6)&&(unit==0))
            System.out.println("sáu mươi");
        else if ((hundred==0)&&(dozen==7)&&(unit==0))
            System.out.println("bảy mươi");
        else if ((hundred==0)&&(dozen==8)&&(unit==0))
            System.out.println("tám mươi");
        else if ((hundred==0)&&(dozen==9)&&(unit==0))
            System.out.println("chín mươi");

        else if ((hundred==0)&&(dozen==0)&&(unit==0))
            System.out.println("không");
        else if ((hundred==0)&&(dozen==0)&&(unit==1))
            System.out.println("một");
        else if ((hundred==0)&&(dozen==0)&&(unit==2))
            System.out.println("hai");
        else if ((hundred==0)&&(dozen==0)&&(unit==3))
            System.out.println("ba");
        else if ((hundred==0)&&(dozen==0)&&(unit==4))
            System.out.println("bốn");
        else if ((hundred==0)&&(dozen==0)&&(unit==5))
            System.out.println("năm");
        else if ((hundred==0)&&(dozen==0)&&(unit==6))
            System.out.println("sáu");
        else if ((hundred==0)&&(dozen==0)&&(unit==7))
            System.out.println("bảy");
        else if ((hundred==0)&&(dozen==0)&&(unit==8))
            System.out.println("tám");
        else if ((hundred==0)&&(dozen==0)&&(unit==9))
            System.out.println("chín");

        else {
            switch (hundred){
                case 0:
                    System.out.println("le");
                    break;
                case 1:
                    System.out.println("một trăm");
                    break;
                case 2:
                    System.out.println("hai trăm");
                    break;
                case 3:
                    System.out.println("ba trăm");
                    break;
                case 4:
                    System.out.println("bốn trăm");
                    break;
                case 5:
                    System.out.println("năm trăm");
                    break;
                case 6:
                    System.out.println("sáu trăm");
                    break;
                case 7:
                    System.out.println("bảy trăm");
                    break;
                case 8:
                    System.out.println("tám trăm");
                    break;
                case 9:
                    System.out.println("chín trăm");
            }
            switch (dozen){
                case 0:
                    System.out.println("lẻ");
                    break;
                case 1:
                    System.out.println("mười");
                    break;
                case 2:
                    System.out.println("hai mười");
                    break;
                case 3:
                    System.out.println("ba mươi");
                    break;
                case 4:
                    System.out.println("bốn mươi");
                    break;
                case 5:
                    System.out.println("năm mươi");
                    break;
                case 6:
                    System.out.println("sáu mươi");
                    break;
                case 7:
                    System.out.println("bảy mươi");
                    break;
                case 8:
                    System.out.println("tám mươi");
                    break;
                case 9:
                    System.out.println("chín mươi");
                    break;
            }
            switch (unit){
                case 0:
                    System.out.println("lẻ");
                    break;
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
            }
        }
    }
}

