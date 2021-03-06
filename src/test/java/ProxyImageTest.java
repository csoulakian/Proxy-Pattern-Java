import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Chrissy Soulakian
 * ProxyPattern Project
 * Created on 4/16/2016
 */
public class ProxyImageTest {

    private final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
    private static final String loading = "Loading Image";
    private static final String displaying = "Displaying Image";

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(myOut));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    /**
     * Showing an image once requires the image to load first.
     * @throws Exception
     */
    @Test
    public void testShowImageOnce() throws Exception {
        final ImageInterface IMAGE1 = new ProxyImage("Image");
        IMAGE1.showImage();
        String[] output = myOut.toString().split("\n");

        assertEquals(loading, output[0].trim());
        assertEquals(displaying, output[1].trim());
    }

    /**
     * Showing an image twice requires the image to load the first time.
     * The second time the image is shown, it can be displayed right
     * away - does not need to load again.
     * @throws Exception
     */
    @Test
    public void testShowImageTwice() throws Exception {
        final ImageInterface IMAGE1 = new ProxyImage("Image");
        IMAGE1.showImage();
        IMAGE1.showImage();
        String[] output = myOut.toString().split("\n");

        assertEquals(loading, output[0].trim());
        assertEquals(displaying, output[1].trim());
        assertEquals(displaying, output[2].trim());
    }
}