import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AquaWindow extends JPanel implements ActionListener{
    //Attributes
    //Description Labels
    private final JLabel nLabel = new JLabel("N");
    private final JLabel pLabel = new JLabel("P");
    private final JLabel kLabel = new JLabel("K");
    private final JLabel feLabel = new JLabel("Fe");

    //Container for Content
    private final JPanel panel = new JPanel();

    //Interactive Elements
    JCheckBox fertilized;
    JCheckBox waterChanged;


    public AquaWindow(JFrame frame){
        final int WIDTH = frame.getWidth() / 2;
        final int HEIGHT = frame.getHeight();
        nLabel.setBounds(10,10,100,100);

        panel.setBounds(0,0,WIDTH,HEIGHT);
        panel.setBackground(Color.BLUE);

        panel.add(nLabel);
        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
