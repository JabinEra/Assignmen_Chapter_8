package Letters;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Letter_O {

    private Point2D.Double p = new Point2D.Double();
    private final Graphics2D g2;
    public Letter_O(Point2D.Double p , Graphics2D g2 ){
        this.p = p;
        this.g2 = g2;
    }
    public Letter_O(int x, int y , Graphics2D g2){
        this.p.setLocation(x ,y);
        this.g2 = g2;
    }

    public void draw()
    {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(p.getX(), p.getY(), 15, 20);

        g2.draw(ellipse);
    }

}
