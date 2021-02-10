package Shapes;

import javafx.util.Pair;

public class RectPrism2D extends Shape
{
    private final Pair<Rect, Rect> rects;
    // origin
    private int ox;
    private int oy;
    // new origin
    private final int nx;
    private final int ny;
    private final int w;
    private final int h;

    /**
     * @param og original rectangle
     */
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
    public void render()
    {
        rects.getKey().render();
        rects.getValue().render();
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

    /**
     *
     * @param x new x value
     * @param y new y value
     * @throws IllegalArgumentException y must be greater than 0
     */
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        ox = x;
        oy = y;
    }
}