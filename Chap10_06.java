import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
import javax.swing.*;
import java.util.*;

public class Chap10_06 extends JFrame implements ActionListener {
    JTextField display;
    Timer time;

    public Chap10_06() {
        super("Clock Digital");
        time = new Timer(1000, this);
        time.start();
        setForeground(Color.BLUE);
        setFont(new Font("Century Gothic", Font.BOLD, 40));
    }

    public void paint(Graphics g) {

        super.paint(g);
        Date now = new Date();
        g.setColor(Color.DARK_GRAY);
        g.drawString(now.toString().substring(11, 19), 14, 65);
        g.setColor(Color.BLUE);
        g.drawString(now.toString().substring(11, 19), 16, 67);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        Chap10_06 window = new Chap10_06();
        window.setSize(200, 100);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}