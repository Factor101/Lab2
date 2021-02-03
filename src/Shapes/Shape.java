package Shapes;
import java.awt.*;

public abstract class Shape
{
    public Shape()
    {

    }
    public abstract void render(Graphics g);
    // overload
    public void changeOrigin(Point o) throws IllegalArgumentException
    {
        this.changeOrigin(o.x, o.y);
    }
    public void changeOrigin(int x, int y) throws IllegalArgumentException {}
}
