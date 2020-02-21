package JAVAbai4.CacLopHinhHoc.MoveablePoint;

import JAVAbai4.CacLopHinhHoc.Point.Point;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setXY(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float []getXY(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return  ", x1=" + getX() +
                ", y1=" + getY() +
                '}';
    }
   public MoveablePoint move(){

        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
       return this;

   }
}
