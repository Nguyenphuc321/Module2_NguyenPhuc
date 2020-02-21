package Colletcions;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        String[] student = {"nguyen van A","nguyen van B","nguyen van C","nguyen van D"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ten sinh vien can tim:");
        String input_name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0;i<student.length;i++){
            if (student[i].equals(input_name)){
                System.out.println("vi tri cua sinh vien trong danh sach la:"+input_name+":"+(i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Not found" + input_name + " in the list.");
    }
}
