package s4_oop_in_java.bai_tap;

public class Fan {
    public final int slow = 1, medium =2, fast=3;
    private int speed = slow;
    private boolean on =false;
    private double radius = 5;
    private String color = "blue";
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String result="";
        if (!getOn()){
            result = "fan is off";
        } else {
            result = "Fan is on {" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    '}';
        }
        return result;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(1, true, 8, "yellow");
        System.out.println(fan1.toString());
    }
}
