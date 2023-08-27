package Letters;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Letter_Component extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;

            Point2D.Double h = new Point2D.Double(10, 10);
            Point2D.Double e = new Point2D.Double(25, 10);
            Point2D.Double l1 = new Point2D.Double(40, 10);
            Point2D.Double l2 = new Point2D.Double(55, 10);
            Point2D.Double o = new Point2D.Double(70, 10);

            Letters_H letterH = new Letters_H(10, 10, g2);
            letterH.draw();

            Letters_E letters_E = new Letters_E(25, 10, g2);
            letters_E.draw();

            Letters_L letterL = new Letters_L(40, 10, g2);
            letterL.draw();
            letterL.setLocation(55, 10);
            letterL.draw();

            Letter_O letters_O = new Letter_O(70, 10, g2);
            letters_O.draw();
        }
    }
}
