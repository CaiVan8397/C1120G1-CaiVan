package s6_inheritance.bai_tap.class_point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed (){
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "MovablePoint : (" +
                "x = " + this.x +
                ", y = " + this.y +
                " ), speed = ( " + this.xSpeed +
                ", " + this.ySpeed +" )";
    }

    public MoveablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
