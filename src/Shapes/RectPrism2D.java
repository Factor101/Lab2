package Shapes;

import java.awt.*;
import javafx.util.Pair;

public class RectPrism2D extends Shape
{
    private Pair<Rect, Rect> rects;
    // origin
    private int ox;
    private int oy;
    // new origin
    private int nx;
    private int ny;
    private int w;
    private int h;
    public RectPrism2D(Rect og)
    {
        ox = og.x;
        oy = og.y;
        nx = og.x + (og.w / 2);
        ny = og.y + (og.h / 2);
        w = og.w;
        h = og.h;
        rects = new Pair<>(og, new Rect(nx, ny, og.w, og.h, og.isFilled));
    }
    public void render(Graphics g)
    {
        rects.getKey().render(g);
        rects.getValue().render(g);
        // origin - origin
        g.drawLine(ox, oy, nx, ny);
        // top right
        g.drawLine(ox + w, oy, nx + w, ny);
        // bottom left
        g.drawLine(
                ox,
                oy + h,
                ox + (w / 2),
                oy + ((h * 3) / 2) // cannot use a float, it effectively does 1.5x
        );
        // bottom right
        g.drawLine(
                ox + w,
                oy + h,
                ox + ((w * 3) / 2),
                oy + ((h * 3) / 2)
        );
    }
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        ox = x;
        oy = y;
    }
}