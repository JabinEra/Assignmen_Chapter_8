package Letters;

import javax.swing.JFrame;

public class LetterViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(500, 600);
        frame.setTitle("Letters Spell Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Letter_Component component = new Letter_Component();
        frame.add(component);
        frame.setVisible(true);
    }
}

