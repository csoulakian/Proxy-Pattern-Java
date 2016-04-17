/**
 * Chrissy Soulakian
 * ProxyPattern Project
 * Created on 4/16/2016
 *
 * This is the RealSubject, which is the real object that the ProxyImage represents.
 */
public class HighResolutionImage implements ImageInterface {

    private String filePath = null;

    public HighResolutionImage(String imageFilePath) {
        this.filePath = imageFilePath;
        loadImage();
    }

    public void loadImage() {
        System.out.println("Loading " + filePath);
    }

    public void showImage() {
        System.out.println("Displaying " + filePath);
    }
}
