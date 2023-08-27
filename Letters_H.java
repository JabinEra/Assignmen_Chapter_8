package Letters;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Letters_H {
    private Point2D.Double p = new Point2D.Double();
    private Graphics2D g2;

    public Letters_H(Point2D.Double p, Graphics2D g2)
    {
        this.p = p;
        this.g2 = g2;
    }
    public Letters_H(int x, int y, Graphics2D g2){
        this.p.setLocation(x, y);
        this.g2 = g2;
    }

    public void draw()
    {
        Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
        Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY() + 10, p.getX() + 10, p.getY() + 10);
        Line2D.Double line3 = new Line2D.Double(p.getX() + 10, p.getY(), p.getX() + 10, p.getY() + 20);

        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
    }
}
