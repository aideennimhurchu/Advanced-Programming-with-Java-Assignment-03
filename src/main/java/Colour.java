import java.awt.Color;

public class Colour {
    private float red;
    private float green;
    private float blue;

    //Constructor
    public Colour(float r, float g, float b) {
        red = r;
        green = g;
        blue = b;
        Color createdColour = new Color(r, g, b);
    }

    //Getter methods
    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getBlue() {
        return blue;
    }

    //check equality between colours
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Colour)) {
            return false;
        }

        else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        //cast obj to colour to compare
        Colour c = (Colour) obj;
        return ((red == c.red) && (blue == c.blue) && (green == c.green));
    }
}
