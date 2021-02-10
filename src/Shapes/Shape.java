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
    /**
     *
     * @param x new x value
     * @param y new y value
     * @throws IllegalArgumentException y must be greater than 0
     */
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {}

    /**
     *
     * @param _g Graphics engine
     */
    public static void setGraphics(Graphics _g)
    {
        g = _g;
    }
}
