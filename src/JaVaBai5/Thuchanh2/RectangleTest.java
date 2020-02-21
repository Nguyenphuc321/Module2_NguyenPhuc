package JaVaBai5.Thuchanh2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("xanh",true,5,4);
        System.out.println(rectangle);
    }
}
