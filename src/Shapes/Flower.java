package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class Flower extends Shape
{
    private ArrayList<Arc> arcs = new ArrayList<>();
    private Point origin;

    /**
     *
     * @param orig point of origin
     * @param w width
     * @param h height
     * @param isFilled render a filled shape or an unfilled shape
     */
    public Flower(Point orig, int w, int h, boolean isFilled)
    {
        // Where e = 270:
        // b: 225 = left
        // b: 45 = right
        // b: 135 = up
        // b: 315 = down
        final Point adjust = new Point((7 * w / 10), (7 * h / 10));
        origin = orig;
        // up
        arcs.add(new Arc(
                orig.x,
                orig.y - adjust.y,
                w,
                h,
                135,
                270,
                isFilled
        ));
        // left
        arcs.add(new Arc(
                orig.x - adjust.x,
                orig.y,
                w,
                h,
                225,
                270,
                isFilled
        ));
        // down
        arcs.add(new Arc(
                orig.x,
                orig.y + adjust.y,
                w,
                h,
                315,
                270,
                isFilled
        ));
        // right
        arcs.add(new Arc(
                orig.x + adjust.x,
                orig.y,
                w,
                h,
                45,
                270,
                isFilled
        ));
    }
    public void render()
    {
        for(Arc e : arcs)
        {
            e.render();
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
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        origin.x = x;
        origin.y = y;
    }
}
