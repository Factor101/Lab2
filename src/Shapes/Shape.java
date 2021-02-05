package Shapes;

import java.awt.*;

public abstract class Shape
{
    // Graphics for all shapes
    protected static Graphics g;

    public abstract void render();
    // overload
    public void changeOrigin(Point o) throws IllegalArgumentException
    {
        changeOrigin(o.x, o.y);
    }
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {}

    public static void setGraphics(Graphics _g)
    {
        g = _g;
    }
}
