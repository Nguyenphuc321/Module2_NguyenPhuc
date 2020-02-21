package JAVAbai2.DemSoBanNhap;

import java.util.Scanner;

public class DemSo0 {
    private static Scanner sc;
    public static void main(String[] args) {
        int Number, Count = 0;
        sc = new Scanner(System.in);
        System.out.println("nhập vào số bạn muốn");
        Number = sc.nextInt();
        while (Number/10>1){
            Count++;
            Number = Number/10;
        }
        System.out.println("sô bạn nhập có "+Count);
    }
}
