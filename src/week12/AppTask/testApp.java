package week12.AppTask;

public class testApp {
    public static void main(String[] args) {


        Instagram instagram = new Instagram(3.4);
        instagram.download();
        instagram.postPicture();
        //instagram.watchVideo();

        Youtube youtube = new Youtube(4.5);
        youtube.hashCode();
        youtube.watchVideo();


    }
}
