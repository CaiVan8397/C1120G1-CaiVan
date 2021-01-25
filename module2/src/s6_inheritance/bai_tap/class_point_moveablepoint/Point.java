package s6_inheritance.bai_tap.class_point_moveablepoint;

import java.util.Arrays;

public class Point {
    protected float x = 0.0f;
    protected  float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y) {
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
        return "Point: " + Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point p = new Point(5,10);
        System.out.println(p);
    }
}
