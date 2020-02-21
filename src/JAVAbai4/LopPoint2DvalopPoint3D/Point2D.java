package JAVAbai4.LopPoint2DvalopPoint3D;

public class Point2D {
    int x,y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double dist2D(Point2D point2D){
        double distance = Math.sqrt(Math.pow((point2D.x - x), 2) + Math.pow((point2D.y - y), 2));
        return distance;
    }
    public void printDistance(double d) {
        System.out.println("2D distance = " + (int) Math.ceil(d));
    }
}
