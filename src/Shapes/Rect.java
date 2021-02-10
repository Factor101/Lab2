package Shapes;

import java.awt.Point;

public class Rect extends Shape
{
    public int x;
    public int y;
    public int w;
    public int h;
    public boolean isFilled;
    // overload
    public Rect(Point origin, int _w, int _h, boolean _isFilled)
    {
        this(origin.x, origin.y, _w, _h, _isFilled);
    }

    /**
     *
     * @param _x x origin
     * @param _y y origin
     * @param _w width
     * @param _h height
     * @param _isFilled render as filled or unfilled
     */
    public Rect(int _x, int _y, int _w, int _h, boolean _isFilled)
    {
        x = _x;
        y = _y;
        w = _w;
        h = _h;
        isFilled = _isFilled;
    }
    public void render()
    {
        if(isFilled) {
            g.fillRect(x, y, w, h);
        } else {
            g.drawRect(x, y, w, h);
        }
    }

    /**
     *
     * @param x new x value
     * @param y new y value
     * @throws IllegalArgumentException y must be greater than 0
     */
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {
        this.x = x;
        this.y = y;
    }
}