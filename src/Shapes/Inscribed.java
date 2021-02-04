package Shapes;

import java.awt.*;

public class Inscribed extends Shape
{

    private final Point origin;
    private final int w, h;

    // declare shapes
    private final Oval outer;
    private final Oval inner;
    private final Polygon triangle;

    public Inscribed(Point _origin, int _w, int _h)
    {
        origin = _origin;
        w = _w;
        h = _h;
        // define shapes
        outer = new Oval(origin.x, origin.y, w, h, false);
        inner = new Oval(
                // make the inner oval ~ centered
                origin.x + w / 4,
                origin.y + h / 4,
                w / 2,
                h / 2,
                false
        );
        // math to find difference from edge of circle to true radius
        // b
        int dif;
        // c
        int radius = w / 2;
        // a
        int sideA = radius / 2;
        // ( a^2 + b^2 = c^2 ) == ( b^2 = c^2 - a^2 ) == ( b = sqrt(c) - sqrt(a) )
        // multiply by 2 to get both sides and subtract width for true difference
        dif = (int) (w - (2 * ((int) Math.sqrt(radius) - Math.sqrt(sideA))));
        // construct triangle using math above
        triangle = new Polygon(
                new int[]{
                        origin.x + w / 2,
                        origin.x + (w - dif) + (w / 20),
                        origin.x + dif - (w / 20)
                },
                new int[]{
                        origin.y,
                        origin.y + h - (h / 4),
                        origin.y + h - (h / 4)
                },
                3,
                false
        );
    }
    public void render()
    {
        outer.render();
        inner.render();
        triangle.render();
    }
}
