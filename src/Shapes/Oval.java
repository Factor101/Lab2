package Shapes;

import java.awt.Point;

public class Oval extends Shape
{
    public int x, y, w, h;
    public boolean isFilled;
    // overload
    public Oval(Point origin, int _w, int _h, boolean _isFilled)
    {
        this(origin.x, origin.y, _w, _h, _isFilled);
    }
    public Oval(int _x, int _y, int _w, int _h, boolean _isFilled)
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
            g.fillOval(x, y, w, h);
        } else {
            g.drawOval(x, y, w, h);
        }
    }

    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        this.x = x;
        this.y = y;
    }
}
