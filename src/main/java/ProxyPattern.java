/**
 * Chrissy Soulakian
 * ProxyPattern Project
 * Created on 4/16/2016
 *
 * Client containing the main method.
 */
public class ProxyPattern {

    public static void main(String[] args) {
        final ImageInterface IMAGE1 = new ProxyImage("HiRes_10MB_Image1");
        final ImageInterface IMAGE2 = new ProxyImage("HiRes_10MB_Image2");

        System.out.println("\n***** Display Image1 for the first time - loading necessary ******");
        IMAGE1.showImage();

        System.out.println("\n***** Display Image1 again - loading unnecessary ******");
        IMAGE1.showImage();

        System.out.println("\n***** Display Image2 for the first time - loading necessary ******");
        IMAGE2.showImage();

        System.out.println("\n***** Display Image2 again - loading unnecessary ******");
        IMAGE2.showImage();

        System.out.println("\n***** Display Image1 again - loading is still unnecessary ******");
        IMAGE1.showImage();

    }
}
