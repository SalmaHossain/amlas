import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener {
    JPanel panel;
    JLabel userid;
    JTextField user;
    JTextField pass;
    JButton ok;

    public Login(){
        super("Login");
        userid = new JLabel("User ID: ");
        user = new JTextField(10);
        pass = new JTextField(10);
        ok = new JButton("Login");


        setLayout(new FlowLayout(FlowLayout.LEFT,150,20));
        add(userid);
        add(user);
        add(pass);
        add(ok);


        ok.addActionListener(this);


        setSize(400,300);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== ok){
            setVisible(false);
            new Calculators();
        }
        try{

            File f = new File("user.txt");
            FileWriter fw = new FileWriter(f,true);
            fw.write( user.getText() + "\t");
            fw.close();
        }
        catch(IOException ee){
            ee.printStackTrace();
        }

    }


    public static void main(String[] args) {

        new Login();
    }
}
