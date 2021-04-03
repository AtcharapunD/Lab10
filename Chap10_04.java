import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Chap10_04 extends JFrame {
    private JLabel jLab;
    private JButton jBtnAlpha, jBtnBeta;

public Chap10_04() {
super("");
getContentPane().setLayout(new FlowLayout());
JPanel jPanel1 = new JPanel();
jPanel1.setPreferredSize( new Dimension(100,100));
jPanel1.setOpaque(true);

jPanel1.setBorder(
BorderFactory.createLineBorder(Color.BLUE,3));
JPanel jPanel2 = new JPanel();
jPanel2.setPreferredSize( new Dimension(100,60));
jPanel2.setOpaque(true);
jPanel2.setBorder(
BorderFactory.createLineBorder(Color.RED, 3));
jLab = new JLabel("Press a Button");
jBtnAlpha = new JButton("Alpha");
jBtnBeta = new JButton("Beta");
jBtnAlpha.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
jLab.setText("Alpha pressed.");
}
});
jBtnBeta.addActionListener( new ActionListener() {
public void actionPerformed(ActionEvent e) {
jLab.setText("Beta pressed.");
}
});
jPanel1.add(jBtnAlpha);
jPanel1.add(jBtnBeta);
jPanel1.add(jLab);
jPanel2.add(new JLabel("One"));
jPanel2.add(new JLabel("Two"));
jPanel2.add(new JLabel("Three"));
getContentPane().add(jPanel1);
getContentPane().add(jPanel2);

}

    public static void main(String[] args) {
        Chap10_04 window = new Chap10_04();
        window.setSize(220, 220);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}