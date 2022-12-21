import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Struct;

public class Main implements ActionListener {
    JTextArea tekst;
    public static void main(String[] args) {
         Main gui = new Main();
        gui.doRoboty();

    }
    public void  doRoboty(){
        JFrame ramka = new JFrame();
        JPanel panel = new JPanel();
        JButton przycisk = new JButton("naciśnij mnie :)");
        ramka.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        przycisk.addActionListener(this);
        tekst = new JTextArea(10,20);
        tekst.setLineWrap(true);

        JScrollPane przewijanie = new JScrollPane(tekst);
        przewijanie.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        przewijanie.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(przewijanie);
        ramka.getContentPane().add(BorderLayout.CENTER,panel);
        ramka.getContentPane().add(BorderLayout.SOUTH,przycisk);

        ramka.setSize(350,300);
        ramka.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tekst.append("Naciśnięto przycisk \n");
    }
}