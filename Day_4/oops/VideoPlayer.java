package oops;

public class VideoPlayer implements Playable , Streamble{
    public void play(){
        System.out.println("VideoPlayer playing video");
    }
    public void stream()
    {
        System.out.println("VideoPlayer streaming video");
    }
}
