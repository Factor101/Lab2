package Shapes;

import java.awt.Point;

public class Arc extends Shape
{
    public int x, y, w, h, b, e;
    public boolean isFilled;
    // overload
    public Arc(Point origin, int _w, int _h, int _b, int _e, boolean _isFilled)
    {
        this(origin.x, origin.y, _w, _h, _b, _e, _isFilled);
    }
    /**
     *
     * @param _x x origin
     * @param _y y origin
     * @param _w width
     * @param _h height
     * @param _b starting angle
     * @param _e angle length relevant to the starting angle _b
     * @param _isFilled draw a filled shape or an unfilled shape
     */
    public Arc(int _x, int _y, int _w, int _h, int _b, int _e, boolean _isFilled)
    {
        x = _x;
        y = _y;
        w = _w;
        h = _h;
        b = _b;
        e = _e;
        isFilled = _isFilled;
    }
    public void render()
    {
        if(isFilled) {
            g.fillArc(x, y, w, h, b, e);
        } else {
            g.drawArc(x, y, w, h, b, e);
        }
    }
    /**
     *
     * @param _x new x value
     * @param _y new y value
     * @throws IllegalArgumentException y must be greater than 0
     */
    public void changeOrigin(int _x, int _y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        x = _x;
        y = _y;
    }
}
