import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ColourTester {
    @Test
    public void testRGBConstructor() {
        Colour c = new Colour(0.5, 0.6, 0.2);
        assertEquals(0.5, c.getRed());
        assertEquals(0.6, c.getGreen());
        assertEquals(0.2, c.getBlue());
        }
}
