package Letters;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Letters_L {

    private Point2D.Double p = new Point2D.Double();
    private Graphics2D g2;

    public Letters_L(Point2D.Double p, Graphics2D g2)
    {
        this.p = p;
        this.g2 = g2;
    }
    public Letters_L(int x, int y, Graphics2D g2){
        this.p.setLocation(x, y);
        this.g2 = g2;
    }

    public void draw()
    {
        Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
        Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY() + 20, p.getX() + 10, p.getY() + 20);

        g2.draw(line1);
        g2.draw(line2);
    }

    public void setLocation(int x, int y)
    {
        this.p.setLocation(x, y);
    }


}
