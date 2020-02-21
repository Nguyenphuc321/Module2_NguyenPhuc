package JaVabai6.TrienKhaiMyList;

import java.util.LinkedList;

public class AddLinkList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("name");
        linkedList.add("address");
        linkedList.add("age");
        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();
    }
}
