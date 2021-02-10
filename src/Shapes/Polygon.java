package Shapes;

public class Polygon extends Shape
{
    public int sides;
    public boolean isFilled;
    public int[] xPoints;
    public int[] yPoints;

    /**
     *
     * @param x array of x points
     * @param y array of y points
     * @param _sides number of points
     * @param _isFilled render a filled shape or unfilled
     * @throws IllegalArgumentException sides must be greater than or equal to 3
     */
    public Polygon(int[] x, int[] y, int _sides, boolean _isFilled) throws IllegalArgumentException
    {
        if(_sides < 3) throw new IllegalArgumentException("Sides must be greater than or equal to 3");
        xPoints = x;
        yPoints = y;
        sides = _sides;
        isFilled = _isFilled;
    }
    public void render()
    {
        if(isFilled) {
            g.fillPolygon(xPoints, yPoints, sides);
        } else {
            g.drawPolygon(xPoints, yPoints, sides);
        }
    }
}