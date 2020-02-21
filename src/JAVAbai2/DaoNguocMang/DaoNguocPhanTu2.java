package JAVAbai2.DaoNguocMang;

import java.util.Arrays;
import java.util.Collections;

public class DaoNguocPhanTu2 {
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args) {
        Integer []arr = {1,4,30,40,50,60};
        reverse(arr);
    }
}
