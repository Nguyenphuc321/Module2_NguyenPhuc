package JaVaBai5.Thuchanh2;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("xanh",true,5,4);
        System.out.println(square);
    }
}
