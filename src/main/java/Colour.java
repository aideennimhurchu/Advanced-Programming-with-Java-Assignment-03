import java.awt.Color;
import java.util.LinkedList;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Colour {
    //for constructor with floating point parameters
    private float red;
    private float green;
    private float blue;

    // for constructor with long parameter
    private String red2;
    private String green2;
    private String blue2;

    //Constructor with floating point parameters
    public Colour(float r, float g, float b) {
        red = r;
        green = g;
        blue = b;
        Color createdColour = new Color(red, green, blue);
    }

    // Constructor with long combined value parameter
    public Colour(String rgbInput) {
        String red2 = null;
        String green2 = null;
        String blue2 = null;
        Long rgbInputLong = parseLong(rgbInput);
        String rgbValue;

        LinkedList<Long> stack = new LinkedList<Long>();
        while (rgbInput.length() > 0) {
            stack.push(rgbInputLong % 10);
            rgbInputLong = rgbInputLong / 10;
        }

        while (!stack.isEmpty()) {
            long x = stack.pop();

            //sort stack into r, g and b values
            if ((stack.size() <= 9) && (stack.size() >= 7)) { //blue
                blue2 += x;

            } else if ((stack.size() <= 6) && (stack.size() >= 4)) { //green
                green2 += x;

            } else if ((stack.size() <= 3) && (stack.size() >= 1)) {
                red2 += x;
            }
        }

        int rgb = ((parseInt(red2)<<16)|((parseInt(green2))<<8)|(parseInt(blue2)));

        Color createdColour = new Color(rgb);
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
    public String getRed2() {
        return red2;
    }

    public String getGreen2() {
        return green2;
    }

    public String getBlue2() {
        return blue2;
    }

    //Overrides
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
