import java.awt.event.*;
import javax.swing.*;

class MCQtest extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton jb[] = new JRadioButton[5];
    JButton b;
    ButtonGroup bg;
    int count = 0, current = 0;
    int m[] = new int[10];

    MCQtest() {
        super("MCQ Quiz");
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            jb[i] = new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b = new JButton("Next");

        b.addActionListener(this);

        add(b);
        set();
        l.setBounds(30, 40, 450, 20);
        jb[0].setBounds(50, 80, 100, 20);
        jb[1].setBounds(50, 110, 100, 20);
        jb[2].setBounds(50, 140, 100, 20);
        jb[3].setBounds(50, 170, 100, 20);
        b.setBounds(100, 240, 100, 30);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            if (check())
                count = count + 1;
            current++;
            set();
            if (current == 9) {
                b.setText("Result");

            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;

            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void set() {
        jb[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1: 1 byte = ? bits");
            jb[0].setText("4 bits");
            jb[1].setText("8 bits");
            jb[2].setText("6 bits");
            jb[3].setText("2 bits");
        }
        if (current == 1) {
            l.setText("Que2: Data type (int) = ?");
            jb[0].setText("1 byte");
            jb[1].setText("2 bytes");
            jb[2].setText("4 bytes");
            jb[3].setText("8 bytes");
        }
        if (current == 2) {
            l.setText("Que3: (float) = ?");
            jb[0].setText("16 bytes");
            jb[1].setText("8 bytes");
            jb[2].setText("2 bytes");
            jb[3].setText("4 bytes");
        }
        if (current == 3) {
            l.setText("Que4: (double) = ?");
            jb[0].setText("8 bytes");
            jb[1].setText("16 bytes");
            jb[2].setText("4 bytes");
            jb[3].setText("2 bytes");
        }
        if (current == 4) {
            l.setText("Que5: (boolean) = ?");
            jb[0].setText("4 bits");
            jb[1].setText("1 byte");
            jb[2].setText("1 bit");
            jb[3].setText("4 bytes");
        }
        if (current == 5) {
            l.setText("Que6: (char) = ?");
            jb[0].setText("1 byte");
            jb[1].setText("4 bytes");
            jb[2].setText("2 bytes");
            jb[3].setText("8 bytes+");
        }
        if (current == 6) {
            l.setText("Que7: Which one among these is not a class? ");
            jb[0].setText("Swing");
            jb[1].setText("Actionperformed");
            jb[2].setText("ActionEvent");
            jb[3].setText("Button");
        }
        if (current == 7) {
            l.setText("Que8: which one among these is not a function of Object class?");
            jb[0].setText("toString");
            jb[1].setText("finalize");
            jb[2].setText("equals");
            jb[3].setText("getDocumentBase");
        }
        if (current == 8) {
            l.setText("Que9: which function is not present in Applet class?");
            jb[0].setText("init");
            jb[1].setText("main");
            jb[2].setText("start");
            jb[3].setText("destroy");
        }
        if (current == 9) {
            l.setText("Que10: Which one among these is not a valid component?");
            jb[0].setText("JButton");
            jb[1].setText("JList");
            jb[2].setText("JButtonGroup");
            jb[3].setText("JTextArea");
        }
        l.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            jb[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (current == 0)
            return (jb[1].isSelected());
        if (current == 1)
            return (jb[2].isSelected());
        if (current == 2)
            return (jb[3].isSelected());
        if (current == 3)
            return (jb[0].isSelected());
        if (current == 4)
            return (jb[2].isSelected());
        if (current == 5)
            return (jb[2].isSelected());
        if (current == 6)
            return (jb[1].isSelected());
        if (current == 7)
            return (jb[3].isSelected());
        if (current == 8)
            return (jb[1].isSelected());
        if (current == 9)
            return (jb[2].isSelected());
        return false;
    }
}