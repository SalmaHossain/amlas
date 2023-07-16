import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CGPACalculator extends JFrame implements ActionListener {
    JLabel subLabel, creditLabel, gradepointLabel;
    JTextField[] subjectField, creditField, gradePointField;
    JButton calculate, back;

    public CGPACalculator(int numberOfSubjects) {
        super("CGPA Calculator");
        subLabel = new JLabel("Subject");
        creditLabel = new JLabel("Credit  NO.");
        gradepointLabel = new JLabel("Grade Points");

        add(subLabel);
        add(creditLabel);
        add(gradepointLabel);

        subjectField = new JTextField[numberOfSubjects];
        creditField = new JTextField[numberOfSubjects];
        gradePointField = new JTextField[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            subjectField[i] = new JTextField();
            creditField[i] = new JTextField();
            gradePointField[i] = new JTextField();

            setLayout(new GridLayout(0, 3));

            add(subjectField[i]);
            add(creditField[i]);
            add(gradePointField[i]);
        }
        calculate = new JButton("Calculate CGPA");
        back = new JButton("Back");
        calculate.addActionListener(this);
        back.addActionListener(this);
        add(calculate);
        add(back);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            //new calculator();
        } else {

            int totalCreditPoint = 0;
            double totalGradePoints = 0.0;

            for (int i = 0; i < creditField.length; i++) {
                int creditHours = Integer.parseInt(creditField[i].getText());
                double gradePoints = Double.parseDouble(gradePointField[i].getText());

                totalCreditPoint += creditHours;
                totalGradePoints += creditHours * gradePoints;
            }

            double cgpa = totalGradePoints / totalCreditPoint;

            JOptionPane.showMessageDialog(null, " CGPA : " + String.format("%.2f", cgpa));
        }
    }
}