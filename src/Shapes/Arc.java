package Shapes;
import java.awt.Graphics;

public class Arc extends Shape
{
    public int x, y, w, h, b, e;
    public boolean isFilled;
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
    public void render(Graphics g)
    {
        if(isFilled) {
            g.fillArc(x, y, w, h, b, e);
        } else {
            g.drawArc(x, y, w, h, b, e);
        }
    }
    public void changeOrigin(int _x, int _y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        x = _x;
        y = _y;
    }
}
