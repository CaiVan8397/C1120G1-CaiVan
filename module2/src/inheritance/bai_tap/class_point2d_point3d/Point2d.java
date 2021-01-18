package inheritance.bai_tap.class_point2d_point3d;

import java.util.Arrays;

public class Point2d {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public  Point2d(){
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point2d: " + "(" + Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point2d abc = new Point2d(10,20);
        System.out.println(abc);
    }
}
