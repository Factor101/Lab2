package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class Word extends Shape
{
    private final ArrayList< ArrayList<Rect> > letters = new ArrayList<>();

    public Word(Point origin, int scale, String str)
    {
        int x = origin.x;
        int y = origin.y;
        final int w = scale;
        final int h = scale;
        scale /= 5;
        for(char e : str.toCharArray())
        {
            final ArrayList<Rect> toAdd = new ArrayList<>();
            switch(e)
            {
                case 'A':
                    // left side
                    toAdd.add(new Rect(
                            x,
                            y,
                            w,
                            h * scale,
                            true
                    ));
                    // bridge
                    toAdd.add(new Rect(
                       x,
                       y + h,
                       3 * w,
                       h,
                       true
                    ));
                    // right side
                    toAdd.add(new Rect(
                            x + (3 * w),
                            y,
                            w,
                            h * scale,
                            true
                    ));
                    // top
                    toAdd.add(new Rect(
                            x,
                            y - h,
                            w * 4,
                            h,
                            true
                    ));
                    break;
                case 'P':
                    // left side
                    toAdd.add(new Rect(
                       x,
                       y,
                       w,
                       h * scale,
                       true
                    ));
                    // top
                    toAdd.add(new Rect(
                            x,
                            y - h,
                            w * 3,
                            h,
                            true
                    ));
                    // bridge
                    toAdd.add(new Rect(
                            x,
                            y + h,
                            w * 3,
                            h,
                            true
                    ));
                    // right side
                    toAdd.add(new Rect(
                            x + (w * 3),
                            y - h,
                            w,
                            h * 3,
                            true
                    ));
                    break;
                case 'C':
                    // left
                    toAdd.add(new Rect(
                            x,
                            y,
                            w,
                            h * scale,
                            true
                    ));
                    // top
                    toAdd.add(new Rect(
                            x,
                            y - h,
                            w * 4,
                            h,
                            true
                    ));
                    // bottom
                    toAdd.add(new Rect(
                            x + w,
                            y + (h * scale) - h,
                            w * 3,
                            h,
                            true
                    ));
                    break;
                case 'S':
                    // left
                    toAdd.add(new Rect(
                            x,
                            y,
                            w,
                            (h + (h * scale)) / 3,
                            true
                    ));
                    // top
                    toAdd.add(new Rect(
                            x,
                            y - h,
                            w * 4,
                            h,
                            true
                    ));
                    // middle
                    toAdd.add(new Rect(
                            x,
                            y + h,
                            w * 4,
                            h,
                            true
                    ));
                    // right
                    toAdd.add(new Rect(
                            x + (w * 3),
                            y + ((h + (h * scale)) / 3),
                            w,
                            (h + (h * scale)) / 3,
                            true
                    ));
                    // bottom
                    toAdd.add(new Rect(
                            x,
                            y + (h * scale) - h,
                            w * 4,
                            h,
                            true
                    ));
                    break;
            }
            letters.add(toAdd);
            // move x to the right for next letter
            x += w * 5;
        }
    }
    public void render()
    {
        for(ArrayList<Rect> e : letters)
        {
            for(Rect el : e)
            {
                el.render();
            }
        }
    }
}
