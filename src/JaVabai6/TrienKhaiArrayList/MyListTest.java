package JaVabai6.TrienKhaiArrayList;

import JaVabai6.TrienKhaiArrayList.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0,15);
        myList.add(1,20);
        myList.add(2,30);
        myList.add(3,50);
        myList.add(4,60);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.clear();
        myList.hienThiDanhSach();
        System.out.println(myList.indexOf(2));

        //myList.add(1,30);
        myList.remove(1);
        myList.hienThiDanhSach();
        System.out.println("----------------");
        MyList<Integer> list2 = myList.clone();
        System.out.println("------------------");
        list2.add(3,50);
        list2.hienThiDanhSach();
        System.out.println("---------------");
        MyList<Integer> list3 = myList.clone();
        list3.hienThiDanhSach();
    }
}
