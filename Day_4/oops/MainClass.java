package oops;

public class MainClass {
    public static void main(String[] args){
        Playable AudioPlay=new AudioPlayer();
        Recordable AudioRec=new AudioPlayer();

        Playable VideoPlay = new VideoPlayer();
        Streamble VideoStream= new VideoPlayer();

        Recordable CamRec= new Camera();
        Streamble CamStream=new Camera();

        AudioPlay.play();
        AudioRec.record();

        VideoPlay.play();
        VideoStream.stream();

        CamRec.record();
        CamStream.stream();


    }
}
