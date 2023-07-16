import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverter extends JFrame implements ActionListener {
    JLabel celsiuslable;
    JLabel farenheitlable;
    JTextField celsiustextfield,farenheittextfield;
    JButton converterbutton,back;


    public CelsiusConverter(){
        super("Temperature Converter");


        celsiuslable = new JLabel("Celsius");
        farenheitlable = new JLabel("Farhenheit");


        celsiustextfield = new JTextField(10);
        farenheittextfield = new JTextField(10);


        converterbutton = new JButton("Convert");
        back = new JButton("Back");


        setLayout(new FlowLayout(FlowLayout.LEFT,150,20));
        add(celsiuslable);
        add(celsiustextfield);
        add(converterbutton);
        converterbutton.addActionListener(this);
        add(farenheitlable);
        add(farenheittextfield);
        add(back);
        back.addActionListener(this);


        setSize(400,300);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
            new Calculators();
        }
        else {
            int temfer = (int) ((Double.parseDouble(celsiustextfield.getText())) * 1.8 + 32);


            farenheittextfield.setText(temfer + " F ");
        }
    }

}
