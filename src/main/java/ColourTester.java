import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ColourTester {
    @Test
    public void testRGBConstructor() {
        //create colour objects to use for testing
        Colour c1 = new Colour((float) 0.5, (float) 0.6, (float) 0.2);
        Colour c2 = new Colour((float) 0.5, (float) 0.6, (float) 0.2);

        //test that constructor is functioning properly
        assertEquals((float) 0.5, c1.getRed());
        assertEquals((float) 0.6, c1.getGreen());
        assertEquals((float) 0.2, c1.getBlue());

        //test that Equals() override is functioning properly

        //test equality with same object
        boolean expected1 = true;
        boolean actual1 = c1.equals(c1);
        assertEquals(expected1, actual1);

        //test equality with different colour object
        boolean expected2 = false;
        boolean actual2 = c1.equals(c2);
        assertEquals(c1, c2);
        }
}
