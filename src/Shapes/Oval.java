package Shapes;
import java.awt.*;

public class Oval extends Shape
{
    public int x, y, w, h;
    public boolean isFilled;
    public Oval(int _x, int _y, int _w, int _h, boolean _isFilled)
    {
        x = _x;
        y = _y;
        w = _w;
        h = _h;
        isFilled = _isFilled;
    }
    public void render(Graphics g)
    {
        if(isFilled) {
            g.fillRect(x, y, w, h);
        } else {
            g.drawOval(x, y, w, h);
        }
    }
}
