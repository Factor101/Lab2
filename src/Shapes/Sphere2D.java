package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class Sphere2D extends Shape
{
    private final ArrayList<Oval> ovalsA = new ArrayList<>();
    private final ArrayList<Oval> ovalsB = new ArrayList<>();

    public Sphere2D(Oval base)
    {
        final int subFactor = base.w / 4;
        int tempWidth = base.w;
        int tempHeight = base.h;
        for(int i = 0; i < 4; i++)
        {
            // A, shifter is width
            ovalsA.add(new Oval(
                    // we have to scale the x the same as we are shifiting width by
                    base.x + (i * (subFactor / 2)),
                    base.y,
                    tempWidth,
                    base.h,
                    base.isFilled)
            );
            // B, shifter is height
            ovalsB.add(new Oval(
                    base.x,
                    // we have to scale the y the same as we are shifiting height by
                    base.y + (i * (subFactor / 2)),
                    base.w,
                    tempHeight,
                    base.isFilled)
            );
            tempHeight -= subFactor;
            tempWidth -= subFactor;
        }
        // remove duplicate default oval
        ovalsB.remove(0);
    }
    public void render(Graphics g)
    {
        // render A
        for(Oval e : ovalsA)
        {
            e.render(g);
        }
        // render B
        for(Oval e : ovalsB)
        {
            e.render(g);
        }
    }
    public void changeOrigin(int x, int y) throws IllegalArgumentException
    {
        if(y < 0) throw new IllegalArgumentException("Y must be greater than or equal to 0");
        for(Oval e : ovalsA)
        {
            e.x = x;
            e.y = y;
        }
        for(Oval e : ovalsB)
        {
            e.x = x;
            e.y = y;
        }
    }
}