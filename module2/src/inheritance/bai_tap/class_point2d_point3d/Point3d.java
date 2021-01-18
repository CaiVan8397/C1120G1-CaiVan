package inheritance.bai_tap.class_point2d_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3d extends Point2d{
    private float z = 0.0f;

    public Point3d(){
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public  void setXYZ (float x, float y, float z){

        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = {this.x, this.y, this.z};
        return  array;
    }

    @Override
    public String toString() {
        return "Point3d: " + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d(10,20,30);
        System.out.println(point3d);
    }
}
