import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

class EksempelGrid {
    public static void main(String[] args) {
        JFrame vindu = new JFrame("XxX");
        vindu.setLayout(new GridLayout(2,1));
        vindu.setSize(600, 400);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        vindu.add(panel);
        JButton button = new JButton("click");
        panel.add(button);
        JButton button1 = new JButton("kanpp");
        panel.add(button1);

        JPanel hovedPanel = new JPanel();
        hovedPanel.setLayout(new GridLayout(4,4));
        vindu.add(panel);

        for (int  i = 0; i < 6; i++) {
            JButton knapp = new JButton("ta det: " + i);
            hovedPanel.add(knapp);
        }

        vindu.setLocationRelativeTo(null);


        vindu.pack();
        vindu.setVisible(true);
    }
}