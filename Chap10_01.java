import java.awt.*;
import javax.swing.*;

public class Chap10_01 extends JFrame {
    private ImageIcon image1, image2, image3;

    public Chap10_01() {
        super("Using ImageIcon");
        image1 = new ImageIcon("d:/IT2RC/OOP/src/Lab10/logo.gif");
        image2 = new ImageIcon("d:/planes.gif");
        image3 = new ImageIcon("d:/beach.jpg");
    }

    public void paint(Graphics g) {
        image1.paintIcon(this, g, 5, 32);
        image2.paintIcon(this, g, 180, 32);
        image3.paintIcon(this, g, 340, 32);
        g.setFont(new Font("Tahoma", Font.BOLD, 14));
        g.setColor(Color.BLUE);
        g.drawString("Width = " + image1.getIconWidth() +

                " pixel", 10, 210);

        g.drawString("Height = " + image1.getIconHeight() +

                " pixel", 10, 230);

        g.drawString("Width = " + image2.getIconWidth() +

                " pixel", 180, 210);

        g.drawString("Height = " + image2.getIconHeight() +

                " pixel", 180, 230);

        g.drawString("Width = " + image3.getIconWidth() +

                " pixel", 340, 280);

        g.drawString("Height = " + image3.getIconHeight() +

                " pixel", 340, 300);

    }

    public static void main(String[] args) {
        Chap10_01 window = new Chap10_01();
        window.setSize(660, 350);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}