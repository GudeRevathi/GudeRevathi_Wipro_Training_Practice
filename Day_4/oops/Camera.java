package oops;

public class Camera implements Recordable , Streamble{
    public void record(){
        System.out.println("Cemara recording video");
    }
    public void stream(){
        System.out.println("cemara Streamin live video");
    }

}
