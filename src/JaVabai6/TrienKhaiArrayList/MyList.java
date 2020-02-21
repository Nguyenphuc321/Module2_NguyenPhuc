package JaVabai6.TrienKhaiArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int default_capacity = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[default_capacity];


    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("số phần tử không đc âm");
        }
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index<0||index>size) {
            throw new IndexOutOfBoundsException("chỉ số phần tử không vượt quá mảng");
        }
        ensureCapacity(size+1);
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;
    }


    public E remove(int index) {
       if (index<0||index>size){
           throw new ArrayIndexOutOfBoundsException("lỗi vượt quá chỉ số mảng");
       }
       E objRemove = (E) elements[index];
        System.arraycopy(elements,index+1,elements,index,elements.length-index-1);
        elements[size-1] = null;
        size--;
        return objRemove;
    }
    public boolean add(E e){
        ensureCapacity(size+1);
        elements[size++] = e;
        return true;
    }

    public int size() {
        return size;

    }

    public MyList<E> clone() {
       MyList<E> newMyList = new MyList<>();
       newMyList.elements = elements;
       newMyList.size = size;
       return newMyList;
    }
    public int indexOf(E o){
            for (int i = 0; i <size ;i++) {
                if (elements[i].equals(o)||elements[i]==o){
                    return i;
                }
            }
        return -1;
    }
    public boolean contains(E o) {
        return indexOf(o)>=0;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, elements.length + minCapacity);

    }

    public E get(int i) {
       if (i<0||i>=elements.length){
           throw new IndexOutOfBoundsException("index"+i+"size"+size);
       }
       return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size ; i++) {
            elements[i] = null;

        }
        size = 0;
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println("i = " + i +  " value = " + elements[i]);
        }
    }
}
