import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class gui2 extends JFrame{
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;

    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public gui2(){
        super("THe title");
        setLayout(new FlowLayout());

        tf = new JTextField("saurabh is great",22);
        add(tf);

        pb = new JRadioButton("plain",true);
        bb = new JRadioButton("bold",true);
        ib = new JRadioButton("italic",true);
        bib = new JRadioButton("bold and italic",true);
        add(bb);
        add(pb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif",Font.PLAIN,14);
        bf = new Font("Serif",Font.BOLD,14);
        itf= new Font("Serif",Font.ITALIC,14);
        bif = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        tf.setFont(pf);

        pb.addItemListener(new handlerClass(pf));
        bb.addItemListener(new handlerClass(bf));
        ib.addItemListener(new handlerClass(itf));
        bib.addItemListener(new handlerClass(bif));



    }
    private class handlerClass implements ItemListener{
        private Font font;
        public handlerClass(Font f){
            font = f;
        }

        public void itemStateChanged(ItemEvent event) {
            tf.setFont(font);

        }
    }
}
