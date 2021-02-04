package Shapes;

import java.awt.*;

public abstract class Shape
{
    protected static Graphics g;
    public Shape()
    {

    }
    public abstract void render();
    // overload
    public void changeOrigin(Point o) throws IllegalArgumentException
    {
        this.changeOrigin(o.x, o.y);
    }
    public void changeOrigin(int x, int y) throws IllegalArgumentException {}
    public static void setGraphics(Graphics _g)
    {
        g = _g;
    }
}
