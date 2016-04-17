/**
 * Chrissy Soulakian
 * ProxyPattern Project
 * Created on 4/16/2016
 */
public class ProxyImage implements ImageInterface {

    private String filePath = null;
    private HighResolutionImage proxyImage = null;

    public ProxyImage(String imageFilePath) {
        this.filePath = imageFilePath;
    }

    @Override
    public void showImage() {
        if(proxyImage == null) {
            proxyImage = new HighResolutionImage(filePath);
        }
        proxyImage.showImage();
    }

}
