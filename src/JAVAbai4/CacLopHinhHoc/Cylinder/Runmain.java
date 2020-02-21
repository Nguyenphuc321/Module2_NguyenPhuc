package JAVAbai4.CacLopHinhHoc.Cylinder;

import JAVAbai4.CacLopHinhHoc.Circle.Circle;

public class Runmain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area circle :" + circle.getArea());

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 10);
        System.out.println("Total is: " + cylinder.getTotalArea());
    }
}
