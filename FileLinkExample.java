import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileLinkExample extends JFrame {


    public static void main(String[] args) {
        try{
            File fo = new File("booklink.txt");
            if(fo.exists()){
                System.out.println("Already created.");
            }
            else{
                fo.createNewFile();
                System.out.println("creat new one.");
            }
            System.out.println(fo.getAbsolutePath());
            Scanner sc = new Scanner(fo);
            int c =0;
            while(sc.hasNextLine()){
                c++;
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();

        }
        catch(IOException ee){
            ee.printStackTrace();
        }
    }
    private JButton fileLinkButton,back;


    public FileLinkExample(){
        setTitle("File Link");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        fileLinkButton = new JButton("Open File");
        fileLinkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFileLink();
            }
        });


        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(fileLinkButton);


        pack();
        setVisible(true);
    }

    private void openFileLink() {

        String filePath = "C:/Users/salma/IdeaProjects/LEARNING MANAGEMENT SYSTEM/booklink.txt";


        File file = new File(filePath);

        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




