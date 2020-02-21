package JAVAbai3.Main;

import JAVAbai3.LopHinhChuNhat.LopHinhChuNhat;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu rong");
        double width = scanner.nextDouble();
        System.out.println("nhap vao chieu dai");
        double heigth = scanner.nextDouble();
        LopHinhChuNhat lopHinhChuNhat = new LopHinhChuNhat(width,heigth);
        System.out.println("Hinh chu nhat co"+lopHinhChuNhat.display());
        System.out.println("Dien tich hinh chu nhat la"+lopHinhChuNhat.getArea());
        System.out.println("Chu vi hinh chu nhat la"+lopHinhChuNhat.getPerimeter());
    }
}
