import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gui extends JFrame {
    private JButton reg;
    private JButton custom;

    public gui(){
        super("this is it");
        setLayout(new FlowLayout());
        reg = new JButton("REG");
        add(reg);
        Icon b= new ImageIcon(getClass().getResource("b.jpg"));
        Icon x= new ImageIcon(getClass().getResource("x.jpg"));
        custom = new JButton("Custom",b);
        custom.setRolloverIcon(x);
        add(custom);

        handlerClass handler = new handlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    private class handlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));

        }
    }


}
