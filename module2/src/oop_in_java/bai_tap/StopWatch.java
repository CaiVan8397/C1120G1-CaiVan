package oop_in_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public void star(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long  getElapsedTime(){
        return (this.endTime - this.startTime) ;
    }

    public static void main(String[] args) {
        StopWatch abc = new StopWatch();
        abc.star();
        for (int i=0; i<70000;i++){
            for (int j=0; j<60000; j++){
            }
        }
        abc.stop();
        System.out.println("thoi gian bat dau " + abc.getStartTime());
        System.out.println("Thoi gian ket thuc " + abc.getEndTime());
        System.out.println(abc.getElapsedTime());
    }
}
