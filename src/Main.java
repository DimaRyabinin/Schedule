import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    JTextArea text;
    String line;
    JTextField field;

    public static void main(String[] args) {
        Main gui = new Main();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click");
        text = new JTextArea(10, 20);
        field = new JTextField(5);


        button.addActionListener(this);
        panel.add(text);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.EAST,field);

        frame.setSize(300, 300);
        frame.setVisible(true);



    }

    public void actionPerformed(ActionEvent ev) {

        line = field.getText();
        if (line.equals("Четверг")) {
            text.setText("РТЦиС в 8:00 в ауд. 2202");
        }
        else if (line.equals("Пятница")) {
            text.setText("ОТЦ в 10:00 в ауд. 2403");
        }
    }

}