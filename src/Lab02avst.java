import Shapes.Shape;
import Shapes.*;
import org.jetbrains.annotations.NotNull;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Lab02avst extends Applet
{
    // container for all shapes
    public static final ArrayList<Shape> shapes = new ArrayList<>();

    public void init()
    {
        // resize canvas
        setSize(new Dimension(1920, 1080));

        final int globalWidth = 200;
        final int globalHeight = 200;

        // rectangular prism
        shapes.add(new RectPrism2D(
                new Rect(
                        new Point(10, 10),
                        globalWidth,
                        globalHeight,
                        false
                )
        ));

        // sphere
        shapes.add(new Sphere2D(
                new Oval(
                        new Point(
                                // origin + (w|h)/2
                                10 + (globalWidth / 4),
                                10 + (globalHeight / 4)
                        ),
                        globalWidth,
                        globalHeight,
                        false
                )
        ));

        // flower
        shapes.add(new Flower(
                new Point(400, 100),
                globalWidth / 2,
                globalHeight / 2,
                true
        ));

        // inscribed triangle / circle
        shapes.add(new Inscribed(
                new Point(600, 300),
                globalWidth * 2,
                globalHeight * 2
        ));

        // apcs letters
        shapes.add(new Word(
                new Point(100, 500),
                20,
                "APCS"
        ));
    }
    public void paint(@NotNull Graphics g)
    {
        try {
            // define graphics for all shapes
            Shape.setGraphics(g);
            // render all shapes
            for (Shape e : shapes)
            {
                e.render();
            }
        } catch(Exception err) {
            err.printStackTrace();
        }
    }
}