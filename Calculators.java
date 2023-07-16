import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculators extends JFrame implements ActionListener {
    JPanel panel;
    JLabel c1, c2, c3,c4,c5;
    JButton bc1, bc2, bc3,ok1,bc5;

    public Calculators() {
        super("Calculators");

        c1 = new JLabel("Celsius Converter");
        c2 = new JLabel("Simple Calculator");
        c3 = new JLabel("CGPA Calculator");
        c4 = new JLabel("BOOKS AND LINKS");
        c5 = new JLabel("MCQ Quiz");


        bc1 = new JButton("ok");
        bc2 = new JButton("ok");
        bc3 = new JButton("ok");
        ok1 = new JButton("File");
        bc5 = new JButton("ok");


        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        add(c1);
        add(bc1);
        bc1.addActionListener(this);


        add(c2);
        add(bc2);
        bc2.addActionListener(this);


        add(c3);
        add(bc3);
        bc3.addActionListener(this);


        add(c4);
        add(ok1);
        ok1.addActionListener(this);

        add(c5);
        add(bc5);
        bc5.addActionListener(this);

        setSize(400, 400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bc1) {
            setVisible(false);
            new CelsiusConverter();
        }
        else if (e.getSource() == bc2) {
            setVisible(false);
            new SimpleCalculator();
        }
        else if (e.getSource() == bc3) {
            setVisible(false);
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    String input = JOptionPane.showInputDialog("Enter the Number of Subjects:");
                    int numOfSubjects= Integer.parseInt(input);
                    new CGPACalculator(numOfSubjects);
                }
            });
        }
        else if(e.getSource()==ok1){
            setVisible(false);
            new FileLinkExample();
        }
        else if(e.getSource()==bc5){
            setVisible(false);
            new MCQtest();
        }
    }
}
