/**
 * Chrissy Soulakian
 * ProxyPattern Project
 * Created on 4/16/2016
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
