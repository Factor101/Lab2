import Shapes.Shape;
import Shapes.*;
import org.jetbrains.annotations.NotNull;

import java.applet.Applet;
import java.awt.*;

public class Lab02avst extends Applet
{
    //TODO: put all shapes in ArrayList and render with range loop

    // declare variables
    Rect rect;
    RectPrism2D cube;
    Oval oval;
    Sphere2D sphere;
    Flower flower;
    Inscribed insc;
    Word apcs;

    public void init()
    {
        // resize
        setSize(new Dimension(1920, 1080));
        // define variables
        rect = new Rect(
                new Point(10, 10),
                200,
                200,
                false
        );
        cube = new RectPrism2D(rect);

        // origin + (w|h)/2
        oval = new Oval(
                new Point(
                        10 + (rect.w / 4),
                        10 + (rect.h / 4)
                ),
                200,
                200,
                false
        );
        sphere = new Sphere2D(oval);
        flower = new Flower(
                new Point(400, 100),
                100,
                100,
                true
        );
        insc = new Inscribed(
                new Point(600, 300),
                300,
                300
        );
        apcs = new Word(
                new Point(100, 500),
                20,
                "APCS"
        );
    }
    public void paint(@NotNull Graphics g)
    {
        // define graphics for all shapes
        Shape.setGraphics(g);
        // render cube
        cube.render();
        // render sphere
        sphere.render();
        // render flower
        flower.render();
        // render inscribed
        insc.render();
        // render apcs
        apcs.render();
    }
}