package JAVAbai2.SoLanXuatHien;

import java.util.Scanner;

public class DemSoLanCuaChuoi {
    public static void main(String[] args) {
        String chuoi;
        char kytu = 'b';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi bất kỳ:");
        chuoi = scanner.nextLine();
        for (int i = 0; i <chuoi.length() ; i++) {
            if (chuoi.charAt(i)==kytu){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của kí tự "+kytu+"trong chuoi"+chuoi+"la"+count);
    }
}
