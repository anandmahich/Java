import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class gui1 extends JFrame {
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public gui1() {
        super("this it ");
        setLayout(new FlowLayout());

        tf = new JTextField("THis is a sentence ", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        handlerClass handler = new handlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }

    private class handlerClass implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            if (boldbox.isSelected() && italicbox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

            } else if (boldbox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);

            } else if (italicbox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else
                font = new Font("Serif", Font.PLAIN, 14);
            tf.setFont(font);

        }
    }
}
