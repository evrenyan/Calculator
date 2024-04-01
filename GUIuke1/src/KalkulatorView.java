import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorView {
    private JFrame vindu;
    private JPanel hovedPanel;

    private JLabel tekstTall1;
    private JTextField tekstomraade1;
    private JLabel tekstTall2;
    private JTextField tekstomraade2;
    private JLabel tekstResultat;
    private JTextField resultatOmmraade;

    private JButton leggtilKnapp;
    private JButton trekkKnapp;
    private JButton gangeKnapp;
    private JButton deleKnapp;

    public KalkulatorView(Kalkulatorkontroller kontroller) {
        vindu = new JFrame("Kalkulator");
        vindu.setSize(600, 400);
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hovedPanel = new JPanel();
        hovedPanel.setLayout(new GridLayout(5,2));
        vindu.add(hovedPanel);

        Font tekstfont = new Font("Arial", Font.PLAIN, 30);
        tekstTall1 = new JLabel("tall 1:  ");
        tekstTall1.setFont(tekstfont);
        hovedPanel.add(tekstTall1);
        tekstomraade1 = new JTextField();
        tekstomraade1.setFont(tekstfont);
        hovedPanel.add(tekstomraade1);

        tekstTall2 = new JLabel("tall 2: ");
        tekstTall2.setFont(tekstfont);
        hovedPanel.add(tekstTall2);
        tekstomraade2 = new JTextField();
        tekstomraade2.setFont(tekstfont);
        hovedPanel.add(tekstomraade2);

        tekstResultat =  new JLabel("resultat: ");
        tekstResultat.setFont(tekstfont);
        hovedPanel.add(tekstResultat);
        resultatOmmraade = new JTextField();
        resultatOmmraade.setFont(tekstfont);
        hovedPanel.add(resultatOmmraade);

        leggtilKnapp = new JButton("+");
        leggtilKnapp.setFont(tekstfont);
        class  LeggTilKnapp implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroller.leggTil();
            }
        }
        leggtilKnapp.addActionListener(new LeggTilKnapp());
        hovedPanel.add(leggtilKnapp);

        trekkKnapp = new JButton("-");
        trekkKnapp.setFont(tekstfont);
        class trekkKnapp implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroller.trekkFra();
            }
        }
        trekkKnapp.addActionListener(new trekkKnapp());
        hovedPanel.add(trekkKnapp);

        gangeKnapp = new JButton("*");
        gangeKnapp.setFont(tekstfont);
        class gangeKnapp implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroller.gange();
            }
        }
        gangeKnapp.addActionListener(new gangeKnapp());
        hovedPanel.add(gangeKnapp);

        deleKnapp = new JButton("/");
        deleKnapp.setFont(tekstfont);
        class DeleBehandler implements  ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                kontroller.dele();
            }
        }
        deleKnapp.addActionListener(new DeleBehandler());
        hovedPanel.add(deleKnapp);

        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
    public double hentTall1() {
        return Double.parseDouble(tekstomraade1.getText());
    }
    public double hentTall2() {
        return Double.parseDouble(tekstomraade2.getText());
    }
    public void setResultat(double resultat) {
        String stringverdi = String.format("%.2f", resultat);
        resultatOmmraade.setText(stringverdi);
    }
}
